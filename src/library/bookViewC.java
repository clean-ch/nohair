package library;

import java.util.Scanner;

public class bookViewC extends abstractBookView{
	private Scanner num = null;
	private bookC bookc = null;
	public bookViewC() {
		num = new Scanner(System.in);
		bookc = new bookC();
		
		System.out.println("��ӭ����ͼ��������");
		System.out.println("1.����\t\t2.�˳�����");
		System.out.print("��ѡ��:");
		String choice = num.next();
		if ("1".equals(choice)) {
			System.out.println("����ɹ�");
			while(doMianView()) {};
		}
		System.out.println("�ѳɹ��˳�ͼ�����ϵͳ");
	}

	@Override
	public String ShowMian() {
		System.out.println("�������˵�����");
		System.out.println("1,����ͼ�顶2,ɾ��ͼ�顶3,�鿴ͼ�顶4,����ͼ�顶5,�鼮��⡶6,�鼮���⡶7,�˳�����");
		System.out.print("��ѡ��:");
		String choice = num.next();
		return choice;
	}

	@Override
	public model addBookView() {
		System.out.println("�ɹ�����");
		System.out.print("����������ͼ��ı�ţ�");
		String bookid = num.next();
		model newbook = bookc.findId(bookid);
		if (newbook == null) {
			newbook = new model();
			newbook.setBookid(bookid);
			System.out.print("������ͼ������:");
			newbook.setBookName(num.next());
			System.out.print("�����棺");
			newbook.setBookNum(num.nextInt());
			bookc.addBook(newbook);
		}else {
			System.out.println("�鼮�Ѵ�������������");
			newbook = addBookView();
		}
		return newbook;
	}

	@Override
	public void delBookView() {
		System.out.println("�ɹ�����");
		System.out.print("������ɾ��ͼ��ı�ţ�");
		String bookid = num.next();
		model newbook = new model();
		newbook.setBookid(bookid);
		if (bookc.delBook(newbook)) {
			System.out.println("ɾ���ɹ�");
			showBook(null);
		}else {
			System.out.println("ɾ��ʧ��");
		}
		
	}

	@Override
	public model findBookView() {
		System.out.println("�ɹ�����");
		System.out.print("������ɾ��ͼ��ı�ţ�");
		String bookid = num.next();
		model newbook = bookc.findId(bookid);
		if (newbook == null) {
			System.out.println("ͼ�鲻��������������ͼ����");
			newbook = findBookView();
		}else {
			showBook(newbook);
		}
		return newbook;
	}

	@Override
	public void inStoreView() {
		System.out.println("�ɹ�����");
		System.out.print("������ɾ��ͼ��ı�ţ�");
		String bookid = num.next();
		System.out.print("�������������:");
		int inbook = num.nextInt();
		model newbook = bookc.findId(bookid);
		bookc.inStore(bookid, inbook);
		showBook(newbook);
	}

	@Override
	public void outStoreView() {
		System.out.println("�ɹ�����");
		System.out.print("������ɾ��ͼ��ı�ţ�");
		String bookid = num.next();
		System.out.print("�������������:");
		int inbook = num.nextInt();
		model newbook = bookc.findId(bookid);
		bookc.outStore(bookid, inbook);
		showBook(newbook);
	}

	@Override
	public void showBook(model... models) {
		System.out.println("ͼ����\t����\t���");
		if (models == null) {
			models = BookStore.bookStore;
		}
		int count = bookc.getBookStore(models);
		for (int i = 0; i < count; i++) {
			System.out.printf("%s\t%s\t%d\n",models[i].getBookid(),models[i].getBookName(),models[i].getBookNum());
		}
		
	}


}
