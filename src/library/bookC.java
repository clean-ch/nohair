package library;

public class bookC {
	public int getBookStore() {
		int count = 0;
		for(model book : BookStore.bookStore) {
			if(book == null)break;
			count++;
		}
		return count;
	}
	public int getBookStore(model ...books) {
		int count = 0;
		for(model book : books) {
			if(book == null)break;
			count++;
		}
		return count;
	}
	public boolean addBook(model book) {
		int count = getBookStore();
		if(BookStore.bookStore.length == count) {
			return false;
		}
		BookStore.bookStore[count] = book;
		return true;
	}
	public boolean delBook(model book) {
		int count = getBookStore();
		int delInt = -1;
		for (int i = 0; i < count; i++) {
			if(book.getBookid().equals(BookStore.bookStore[i].getBookid())) {
				delInt = i;
				break;
			}
		}
		if (delInt == -1) {
			return false;
		}
		for (int i = delInt; i < count - 1; i++) {
			BookStore.bookStore[i] = BookStore.bookStore[i + 1];	
		}
		BookStore.bookStore[count - 1] = null;
		return true;
	}
	public model findId(String id) {
		int bookCount = getBookStore();
		for (int i = 0; i < bookCount; i++) {
			if (id.equals(BookStore.bookStore[i].getBookid())) {
				return BookStore.bookStore[i];
			}
		}
		return null;
	}
	public boolean inStore(String id, int count) {
		model book = findId(id);
		if (null == book) {
			return false;
		}
		book.setBookNum(book.getBookNum() + count);
		return true;
	}
	public boolean outStore(String id, int count) {
		model book = findId(id);
		if (null == book) {
			return false;
		}
		if(book.getBookNum() < count) {
			return false;
		}
		book.setBookNum(book.getBookNum() - count);
		return true;
	}

}
