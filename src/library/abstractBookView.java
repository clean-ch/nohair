package library;

import java.util.Scanner;

public abstract class abstractBookView {
	
	public abstractBookView() {
	}
	/** 
	 *¹æ¶¨¹Ì¶¨Âß¼­
	 */
	public boolean doMianView() {
		String result = ShowMian();
		switch (result) {
		case "1":
			addBookView();
			showBook(BookStore.bookStore);
			break;
		case "2":
			delBookView();
			break;
		case "3":
			showBook(null);
			break;
		case "4":
			findBookView();
				break;
		case "5":
			inStoreView();	
				break;
		case "6":
			outStoreView();		
				break;
		case "7":
				return false;			
		default:
			break;
		}
		return true;
	}
	public abstract String ShowMian(); 
	public abstract model addBookView();
	public abstract void delBookView();
	public abstract model findBookView();
	public abstract void inStoreView();
	public abstract void outStoreView();
	public abstract void showBook(model ...models);
}
