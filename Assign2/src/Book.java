
public class Book {
	
	private String title;
	private Member mbr;
	
	public Book(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
		
		public void status() {
			if(mbr == null)
				System.out.println("Title is not issued to any member");
			else
				System.out.println("Title is issued to member"+mbr);
		}
		public void issueBook(Member m) {
			
		}
		public void returnBook(Member m) {
			
		}
	

}
