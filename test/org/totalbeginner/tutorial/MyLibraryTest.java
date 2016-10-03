package org.totalbeginner.tutorial;

import java.util.ArrayList;

import junit.framework.TestCase;

public class MyLibraryTest extends TestCase {

	//add fields for books, people, and library to be tested.
	Book b1;
	Book b2;
	Book b3;
	Book b4;
	Person p1;
	Person p2;
	Person p3;
	Person p4;
	MyLibrary ml;
	
	//initialize all the above fields.
	public void setup(){
		b1 = new Book("Book 1");
		b2 = new Book("Book 2");
		b3 = new Book("Book 3");
		b4 = new Book("Book 4");
		
		p1 = new Person();
		p2 = new Person();
		p3 = new Person();
		p4 = new Person();
		
		p1.setName("Person 1");
		p2.setName("Person 2");
		p3.setName("Person 3");
		p4.setName("Person 4");
		
		ml = new MyLibrary("Test Library");
	}

	//test constructor
	public void testMyLibrary(){
		MyLibrary ml = new MyLibrary("Test");
		
		assertEquals("Test", ml.name);
		
		assertTrue(ml.books instanceof ArrayList);
		assertTrue(ml.people instanceof ArrayList);

	}
	
	//testAddBook - in actuality, this method does a lot more than just testing addBook...
	public void testAddBook(){
		//create test objects
		setup();
		
		//test initial size of books = 0 and library name;
		assertEquals(0, ml.getBooks().size());
		assertEquals("Test Library", ml.name);
		
		//add books to library
		ml.addBook(b1);
		ml.addBook(b2);
		ml.addBook(b3);
		ml.addBook(b4);
		
		//this code makes sure all the people were added to the library.
		assertEquals(4, ml.getBooks().size());
		
		//this code makes sure the books were inserted in the correct
		//order, and that nothing else was placed in the library.
		//not sure I would have thought to test this on my own...
		assertEquals(0, ml.getBooks().indexOf(b1));
		assertEquals(1, ml.getBooks().indexOf(b2));
		assertEquals(2, ml.getBooks().indexOf(b3));
		assertEquals(3, ml.getBooks().indexOf(b4));
		
		//add people to library
		ml.addPerson(p1);
		ml.addPerson(p2);
		ml.addPerson(p3);
		ml.addPerson(p4);
		
		//this code makes sure all the people were added to the library.
		assertEquals(4, ml.getPeople().size());
		assertEquals(0, ml.getPeople().indexOf(p1));
		assertEquals(1, ml.getPeople().indexOf(p2));
		assertEquals(2, ml.getPeople().indexOf(p3));
		assertEquals(3, ml.getPeople().indexOf(p4));
		
		//this code tests the removeBook() method.
		ml.removeBook(b1);
		assertEquals(3, ml.getBooks().size());
		ml.removeBook(b2);
		assertEquals(2, ml.getBooks().size());
		ml.removeBook(b3);
		assertEquals(1, ml.getBooks().size());
		ml.removeBook(b4);
		assertEquals(0, ml.getBooks().size());
		
		//this code tests the removePerson() method.
		ml.removePerson(p1);
		assertEquals(3, ml.getPeople().size());
		ml.removePerson(p3);
		assertEquals(2, ml.getPeople().size());
		ml.removePerson(p2);
		assertEquals(1, ml.getPeople().size());
		ml.removePerson(p4);
		assertEquals(0, ml.getPeople().size());
	}

	//testCheckOut
	public void testCheckOut(){
		//need to use setup again, because these are different tests.
		setup();
		ml.addBook(b1);
		ml.addBook(b2);
		ml.addPerson(p1);
		ml.addPerson(p2);
		
		//test to see if book is already checked out. True/False.
		assertTrue("Book did not check out correctly.", ml.checkOut(b1,p1));
		assertEquals("Person 1", b1.getPerson().getName());
		assertFalse("Book is already checked out.", ml.checkOut(b1,p2));
		
		//test check in methods and make sure they work.
		assertTrue("Book check in failed. Why did it fail?", ml.checkIn(b1));
		assertFalse("Book just checked in. Why was book already checked in, allowed to be checked in again?", ml.checkIn(b1));
		assertFalse("Book was never checked out. b2 was never removed.", ml.checkIn(b2));
		
		//if not checked out, set person field in book to the person who's checking out the book
		
		//otherwise, let the calling method know the checkout didn't work.
	}
}
