//package library;
//
//import java.util.Scanner;
//
//public class BookView {
//	
//	private Scanner num = null;
//	private bookC bookc = null;
//	public BookView() {
//		num = new Scanner(System.in);
//		bookc = new bookC();
//		System.out.println("��ӭ����ͼ��������");
//		System.out.println("1.����\t\t2.�˳�����");
//		System.out.print("��ѡ��:");
//		String choice = num.next();
//		if ("1".equals(choice)) {
//			System.out.println("����ɹ�");
//			while(ShowMian()) {};
//		}
//		System.out.println("�ѳɹ��˳�ͼ�����ϵͳ");
//	}
//	public boolean ShowMian() {
//		System.out.println("�������˵�����");
//		System.out.println("1,����ͼ�顶2,ɾ��ͼ�顶3,�鿴ͼ�顶4,����ͼ�顶5,�鼮��⡶6,�鼮���⡶7,�˳�����");
//		System.out.print("��ѡ��:");
//		String choice = num.next();
//		switch (choice) {
//		case "1":
//			addBookView();
//			showBook(BookStore.bookStore);
//			break;
//		case "2":
//			delBookView();
//			break;
//		case "3":
//			showBook(null);
//			break;
//		case "4":
//			findBookView();
//				break;
//		case "5":
//			inStoreView();	
//				break;
//		case "6":
//			outStoreView();		
//				break;
//		case "7":
//				return false;			
//		default:
//			break;
//		}
//		return true;
//	}
//	public model addBookView() {
//		System.out.println("�ɹ�����");
//		System.out.print("����������ͼ��ı�ţ�");
//		String bookid = num.next();
//		model newbook = bookc.findId(bookid);
//		if (newbook == null) {
//			newbook = new model();
//			newbook.setBookid(bookid);
//			System.out.print("������ͼ������:");
//			newbook.setBookName(num.next());
//			System.out.print("�����棺");
//			newbook.setBookNum(num.nextInt());
//			bookc.addBook(newbook);
//		}else {
//			System.out.println("�鼮�Ѵ�������������");
//			newbook = addBookView();
//		}
//		return newbook;
//	}
//	public void delBookView() {
//		System.out.println("�ɹ�����");
//		System.out.print("������ɾ��ͼ��ı�ţ�");
//		String bookid = num.next();
//		model newbook = new model();
//		newbook.setBookid(bookid);
//		if (bookc.delBook(newbook)) {
//			System.out.println("ɾ���ɹ�");
//			showBook(null);
//		}else {
//			System.out.println("ɾ��ʧ��");
//		}
//	}
//	public model findBookView() {
//		System.out.println("�ɹ�����");
//		System.out.print("������ɾ��ͼ��ı�ţ�");
//		String bookid = num.next();
//		model newbook = bookc.findId(bookid);
//		if (newbook == null) {
//			System.out.println("ͼ�鲻��������������ͼ����");
//			newbook = findBookView();
//		}else {
//			showBook(newbook);
//		}
//		return newbook;
//		
//	}
//	public void inStoreView() {
//		System.out.println("�ɹ�����");
//		System.out.print("������ɾ��ͼ��ı�ţ�");
//		String bookid = num.next();
//		System.out.print("�������������:");
//		int inbook = num.nextInt();
//		model newbook = bookc.findId(bookid);
//		bookc.inStore(bookid, inbook);
//		showBook(newbook);
//	}
//	public void outStoreView() {
//		System.out.println("�ɹ�����");
//		System.out.print("������ɾ��ͼ��ı�ţ�");
//		String bookid = num.next();
//		System.out.print("�������������:");
//		int inbook = num.nextInt();
//		model newbook = bookc.findId(bookid);
//		bookc.outStore(bookid, inbook);
//		showBook(newbook);
//	}
//	public void showBook(model ...models) {
//		System.out.println("ͼ����\t����\t���");
//		if (models == null) {
//			models = BookStore.bookStore;
//		}
//		int count = bookc.getBookStore(models);
//		for (int i = 0; i < count; i++) {
//			System.out.printf("%s\t%s\t%d\n",models[i].getBookid(),models[i].getBookName(),models[i].getBookNum());
//		}
//		
//	}
//
//}
