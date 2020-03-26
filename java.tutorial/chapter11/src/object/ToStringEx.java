package object;

class Books {
	int bookNumber;
	String bookTitle;
	
	Books(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
		}
	
	@Override
	public String toString() {
				return bookTitle+","+bookNumber;
	}
	}

public class ToStringEx{
	public static void main(String[]args) {
		Books book1 = new Books(200,"개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
	}
}