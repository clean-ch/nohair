package library;

import java.util.Scanner;

public class bookViewC extends abstractBookView{
	private Scanner num = null;
	private bookC bookc = null;
	public bookViewC() {
		num = new Scanner(System.in);
		bookc = new bookC();
		
		System.out.println("欢迎来到图书管理界面");
		System.out.println("1.登入\t\t2.退出程序");
		System.out.print("亲选择:");
		String choice = num.next();
		if ("1".equals(choice)) {
			System.out.println("登入成功");
			while(doMianView()) {};
		}
		System.out.println("已成功退出图书管理系统");
	}

	@Override
	public String ShowMian() {
		System.out.println("《《主菜单》》");
		System.out.println("1,增加图书《2,删除图书《3,查看图书《4,查找图书《5,书籍入库《6,书籍出库《7,退出程序");
		System.out.print("请选择:");
		String choice = num.next();
		return choice;
	}

	@Override
	public model addBookView() {
		System.out.println("成功进入");
		System.out.print("请输入新增图书的编号：");
		String bookid = num.next();
		model newbook = bookc.findId(bookid);
		if (newbook == null) {
			newbook = new model();
			newbook.setBookid(bookid);
			System.out.print("请输入图书名称:");
			newbook.setBookName(num.next());
			System.out.print("输入库存：");
			newbook.setBookNum(num.nextInt());
			bookc.addBook(newbook);
		}else {
			System.out.println("书籍已存在请重新输入");
			newbook = addBookView();
		}
		return newbook;
	}

	@Override
	public void delBookView() {
		System.out.println("成功进入");
		System.out.print("请输入删除图书的编号：");
		String bookid = num.next();
		model newbook = new model();
		newbook.setBookid(bookid);
		if (bookc.delBook(newbook)) {
			System.out.println("删除成功");
			showBook(null);
		}else {
			System.out.println("删除失败");
		}
		
	}

	@Override
	public model findBookView() {
		System.out.println("成功进入");
		System.out.print("请输入删除图书的编号：");
		String bookid = num.next();
		model newbook = bookc.findId(bookid);
		if (newbook == null) {
			System.out.println("图书不存在请重新输入图书编号");
			newbook = findBookView();
		}else {
			showBook(newbook);
		}
		return newbook;
	}

	@Override
	public void inStoreView() {
		System.out.println("成功进入");
		System.out.print("请输入删除图书的编号：");
		String bookid = num.next();
		System.out.print("请输入入库数量:");
		int inbook = num.nextInt();
		model newbook = bookc.findId(bookid);
		bookc.inStore(bookid, inbook);
		showBook(newbook);
	}

	@Override
	public void outStoreView() {
		System.out.println("成功进入");
		System.out.print("请输入删除图书的编号：");
		String bookid = num.next();
		System.out.print("请输入入库数量:");
		int inbook = num.nextInt();
		model newbook = bookc.findId(bookid);
		bookc.outStore(bookid, inbook);
		showBook(newbook);
	}

	@Override
	public void showBook(model... models) {
		System.out.println("图书编号\t名称\t库存");
		if (models == null) {
			models = BookStore.bookStore;
		}
		int count = bookc.getBookStore(models);
		for (int i = 0; i < count; i++) {
			System.out.printf("%s\t%s\t%d\n",models[i].getBookid(),models[i].getBookName(),models[i].getBookNum());
		}
		
	}


}
