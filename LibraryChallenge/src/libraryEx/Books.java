package libraryEx;

public class Books extends Items {

	private String genre;

	@Override
	public String toString() {
		return "Item [id= " + getId() + ", title= " + getTitle() + ", author= " + getAuthor() + ", year= " + getYear()
				+ ", genre= " + getGenre() + "]";
	}

	// constructor
	public Books(String title, String author, int year, String genre) {
		super(title, author, year);
		this.setGenre(genre);
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
