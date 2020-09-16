package library;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
	private static final String bookFile = "src/library/havabook";
	private static final String sepattr = ",";
	private static final String sepline = System.getProperty("line.separator");
	
	
	public static void saveBook(model ...models) {
		if (models == null || models.length == 0) return;
		bookC bookc = new bookC();
		File bookfile = new File(bookFile);
		if (!bookfile.exists()) {
			try {
				bookfile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try(FileWriter fout = new FileWriter(bookfile,false);
			BufferedWriter out = new BufferedWriter(fout);
			){
			StringBuffer content = new StringBuffer();
			int bookcount = bookc.getBookStore(models);
			for (int i = 0; i < bookcount; i++) {
				content.append(models[i].getBookid());
				content.append(sepattr);
				content.append(models[i].getBookName());
				content.append(sepattr);
				content.append(models[i].getBookNum());
				content.append(sepline);
			}
			out.write(content.toString());
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static model[] loadBooks() {
		File bookfile = new File(bookFile);
		if (!bookfile.exists()) {
			return null;
		}
		model[] bookArray = new model[999];
		try(FileReader fin = new FileReader(bookfile);
				BufferedReader out = new BufferedReader(fin);
			){
			String line = null;
			int count = 0;
			while((line = out.readLine()) != null) {
				model book = new model();
				String[] attrs = line.split(sepattr);
				book.setBookid(attrs[0].trim());
				book.setBookName(attrs[1].trim());
				book.setBookNum(Integer.parseInt(attrs[2].trim()));
				bookArray[count] = book;
				count++;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bookArray;
	}
}
