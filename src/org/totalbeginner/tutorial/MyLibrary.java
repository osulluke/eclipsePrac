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
		int booksOut = this.getBooksForPerson(p1).size();
		
		if((b1.getPerson() == null) && 
				(booksOut < p1.getMaximumBooks()))
		{
			b1.setPerson(p1);
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
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public ArrayList<Book> getBooksForPerson(Person p1) {
		
		//result here is used as a list to hold books someone has checked out.
		ArrayList<Book> result = new ArrayList<Book>();
		
		/*
		The this.getBooks() in the for each loop returns ALL the books that are
		currently checked out, then basically looks to see if the name of
		the person who checked it out matches the name of the person you're
		populating the list for. Oh, it also ensures the book is actually
		checked out...hence the aBook.getPerson() != null statement.
		*/
		for (Book aBook : this.getBooks()) {
			if ((aBook.getPerson() != null) && 
					(aBook.getPerson().getName().equals(p1.getName())))
			{
				result.add(aBook);
			}
		}
		return result;
	}

	public String toString(){
		String outString;
		outString = "Name is " + this.name 
				+ ".\nBooks length is " + this.books.size() 
				+ ".\nPeople length is " + this.people.size() 
				+ ".\nArray: " + this.books
				+ ".\n";
		
		return outString;
	}
}
