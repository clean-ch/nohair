package library;

import javax.swing.JOptionPane;

public class BookRView extends abstractBookView{
	bookC bookc = null;
	public BookRView() {
		bookc = new bookC();
	}
	@Override
	public String ShowMian() {
		String str = "�������˵�����\n";
		str += "1,����ͼ�顶2,ɾ��ͼ�顶3,�鿴ͼ�顶4,����ͼ�顶5,�鼮��⡶6,�鼮���⡶7,�˳�����\n";
		str += "��ѡ��\n";
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
		bookid = JOptionPane.showInputDialog("������ͼ���ţ�");
		bookname = JOptionPane.showInputDialog("������ͼʾ���ƣ�");
		count = Integer.parseInt(JOptionPane.showInputDialog("��棺"));
		newbook.setBookid(bookid);
		newbook.setBookName(bookname);
		newbook.setBookNum(count);
		if (bookc.addBook(newbook)) {
			JOptionPane.showMessageDialog(null, "��ӳɹ�");
		}else {
			JOptionPane.showMessageDialog(null, "���ʧ�ܴ�������");
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
