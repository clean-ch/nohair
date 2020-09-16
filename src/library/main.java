package library;

public class main {

	public static void main(String[] args) {
//		abstractBookView bookview = new BookRView();
//		bookview.doMianView();
//		Files.saveBook(BookStore.bookStore);
		model[] bookArray = Files.loadBooks();
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i] == null) break;
			System.out.println(bookArray[i].getBookid()+"\t"+bookArray[i].getBookName());
		}
		
		
//		model book = new model();
//		book.setBookid("001");
//		book.setBookName("小黄书");
//		book.setBookNum(10);
//		bookC bookc = new bookC();
//		bookc.addBook(book);
//		bookc.delBook(book);
//		book.setBookid("002");
//		
		

	}
//	public static void show() {
//		bookC bookc = new bookC();
//		if (bookc.getBookStore() <= 0) {
//			System.out.println("仓库中未存入书本");
//			return;
//		}
//		for (int i = 0; i < bookc.getBookStore(); i++) {
//			System.out.println(BookStore.bookStore[i].getBookid() + "\t" + BookStore.bookStore[i].getBookName() + "\t" +BookStore.bookStore[i].getBookNum());
//		}
	

}
