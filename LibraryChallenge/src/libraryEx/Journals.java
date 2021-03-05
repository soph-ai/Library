package libraryEx;

public class Journals extends Items {

	private String subject;

	@Override
	public String toString() {
		return "Item [id= " + getId() + ", title= " + getTitle() + ", author= " + getAuthor() + ", year= " + getYear()
				+ ", subject= " + getSubject() + "]";
	}

	// constructor
	public Journals(String title, String author, int year, String subject) {
		super(title, author, year);
		this.setSubject(subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
