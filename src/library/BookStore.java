package library;

public class BookStore {
	
	public static model[] bookStore = new model[999]; 
	//��̬������鼮
	static {
		model book0 = new model();
		book0.setBookid("001");
		book0.setBookName("С����");
		book0.setBookNum(10);
		bookStore[0] = book0;
		
		model book1 = new model();
		book1.setBookid("002");
		book1.setBookName("�㷨");
		book1.setBookNum(10);
		bookStore[1] = book1;
		
		model book2 = new model();
		book2.setBookid("003");
		book2.setBookName("java");
		book2.setBookNum(10);
		bookStore[2] = book2;
		
		model book3 = new model();
		book3.setBookid("004");
		book3.setBookName("C����");
		book3.setBookNum(10);
		bookStore[3] = book3;
	}
	
	
	
		
}
