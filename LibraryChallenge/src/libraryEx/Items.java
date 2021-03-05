package libraryEx;

public abstract class Items implements Readable {

	// instance variables
	private String title;
	private String author;
	private int year;
	private int id;

	@Override
	public void read() {
		System.out.println("You can read this!");
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", author=" + author + ", year=" + year + "]";
	}

	// overloading the methods
	public Items() {
		super();
	}

	// constructor
	public Items(String title, String author, int year) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
