package libraryEx;

public class Runner {
	public static void main(String[] args) {

		// instantiate an object
		Library library1 = new Library();
		Person person = new Person();

		// add items to the library
		library1.addItems(new Books("HP and the Goblet of Fire", "JK Rowling", 2000, "Fantasy"));
		library1.addItems(new Journals("Splitting the atom", "Ernest Rutherford", 1917, "Physics"));

		library1.removeItemsById(1);

		library1.printItems();

		person.registerPerson(new Person("Steff", "Smiley", 2019));

		person.printPeople();
	}

}
