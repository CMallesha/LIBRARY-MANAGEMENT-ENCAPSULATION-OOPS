
public class Library {

	private String name;
	private String address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	void displayBookDetails(Book b) {
		System.out.println("Book available in "+this.name+" of "+this.address);
		System.out.println("==========Book Details===========");
		System.out.println("Book title "+b.getTitle());
		System.out.println("Book author "+b.getAuthor());
		System.out.println("Book isbn "+b.getIsbn());
	}
}
