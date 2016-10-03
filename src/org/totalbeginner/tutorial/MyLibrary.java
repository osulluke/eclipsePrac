package org.totalbeginner.tutorial;

import java.util.ArrayList;

public class MyLibrary {

	String name;
	ArrayList<Book> books;
	ArrayList<Person> people;

	public MyLibrary(String name) {
		// TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub
		this.books.add(b1);
	}

	public void addPerson(Person p1) {
		// TODO Auto-generated method stub
		this.people.add(p1);
	}

	public void removeBook(Book b1) {
		// TODO Auto-generated method stub
		this.books.remove(b1);
	}

	public void removePerson(Person p1) {
		// TODO Auto-generated method stub
		this.people.remove(p1);
	}

}
