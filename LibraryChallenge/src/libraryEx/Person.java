package libraryEx;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String firstName;
	private String lastName;
	private int yearJoined;
	private int personId;

	// create an array of people
	private List<Person> persons = new ArrayList<>();
	private int personCount = 0;

	// overloading the methods
	public Person() {
		super();
	}

	// constructor
	public Person(String firstName, String lastName, int yearJoined) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearJoined = yearJoined;
	}

	@Override
	public String toString() {
		return "People Registered [id= " + personId + ", first name= " + firstName + ", last name= " + lastName
				+ ", year joined= " + yearJoined + "]";
	}

	// getters and setters
	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getYearJoined() {
		return yearJoined;
	}

	public void setYearJoined(int yearJoined) {
		this.yearJoined = yearJoined;
	}

	// print method
	public void printPeople() {
		System.out.println(this.persons);
	}

	// add people method, incl setting incremental id
	public boolean registerPerson(Person person) {
		person.setPersonId(++personCount);
		return this.persons.add(person);
	}

	// remove people method
	public boolean deletePerson(Person person) {
		return this.persons.remove(person);
	}

	public boolean deletePersonById(int personId) {
		for (Person p : this.persons) {
			if (p.getPersonId() == personId) {
				return this.deletePerson(p);
			}
		}
		return false;
	}

}
