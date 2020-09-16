package library;

import javax.swing.JOptionPane;

public class BookRView extends abstractBookView{
	bookC bookc = null;
	public BookRView() {
		bookc = new bookC();
	}
	@Override
	public String ShowMian() {
		String str = "《《主菜单》》\n";
		str += "1,增加图书《2,删除图书《3,查看图书《4,查找图书《5,书籍入库《6,书籍出库《7,退出程序\n";
		str += "亲选择：\n";
		String result = JOptionPane.showInputDialog(str);
		if (result == null) {
			result = "7";
		}
		return result;
	}

	@Override
	public model addBookView() {
		model newbook = new model();
		String bookid = null;
		String bookname = null;
		int count = -1;
		bookid = JOptionPane.showInputDialog("请输入图书编号：");
		bookname = JOptionPane.showInputDialog("请输入图示名称：");
		count = Integer.parseInt(JOptionPane.showInputDialog("库存："));
		newbook.setBookid(bookid);
		newbook.setBookName(bookname);
		newbook.setBookNum(count);
		if (bookc.addBook(newbook)) {
			JOptionPane.showMessageDialog(null, "添加成功");
		}else {
			JOptionPane.showMessageDialog(null, "添加失败从新输入");
			addBookView();
		}
		return newbook;
	}

	@Override
	public void delBookView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public model findBookView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inStoreView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void outStoreView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showBook(model... models) {
		// TODO Auto-generated method stub
		
	}

}
