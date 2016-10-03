package org.totalbeginner.tutorial;

import java.util.ArrayList;

public class MyLibrary {
	String name;
	ArrayList<Book> books;
	ArrayList<Person> people;

	public MyLibrary(String name) {
		this.name = name;
		this.books = new ArrayList<Book>();
		this.people = new ArrayList<Person>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public ArrayList<Person> getPeople() {
		return people;
	}

	public void addBook(Book b1) {
		this.books.add(b1);
	}

	public void addPerson(Person p1) {
		this.people.add(p1);
	}

	public void removeBook(Book b1) {
		this.books.remove(b1);
	}

	public void removePerson(Person p1) {
		this.people.remove(p1);
	}

	public boolean checkOut(Book b1, Person p1) {

		if(b1.getPerson() == null && books.contains(b1))
		{
			b1.person = p1;
			removeBook(b1);
			return true;
		}
		else 
		{
			return false;
		}
	}

	public boolean checkIn(Book b1) 
	{
		if (b1.getPerson() != null)
		{
			b1.setPerson(null);
			addBook(b1);
			return true;
		}
		else 
		{
			return false;
		}
	}

}
