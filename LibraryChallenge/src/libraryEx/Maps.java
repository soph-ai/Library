package libraryEx;

public class Maps extends Items {

	private String country;

	@Override
	public String toString() {
		return "Item [id= " + getId() + ", title= " + getTitle() + ", author= " + getAuthor() + ", year= " + getYear()
				+ ", country= " + getCountry() + "]";
	}

	// constructor
	public Maps(String title, String author, int year, String country) {
		super(title, author, year);
		this.setCountry(country);
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
