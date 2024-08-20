
public class Libmain {
	public static void main(String[] args) {
	
		Library l=new Library();
		l.setName("Central_lib");
		l.setAddress("Vijayanagara");
//		l.displayBookDetails();
		
		Book b=new Book();
		b.setTitle("JFS");
		b.setAuthor("JAMES GOSLING");
		b.setIsbn("JFS001");
//		b.display();
		
		Book b1=new Book();
		b1.setTitle("PFS");
		b1.setAuthor("ANAN");
		b1.setIsbn("PFS002");
//		b1.display();
		
		l.displayBookDetails(b1);
		l.displayBookDetails(b);
	
		
	}
}
