package org.totalbeginner.tutorial;

import junit.framework.TestCase;

public class BookTest extends TestCase {
	
	public void testBook(){
		Book b1 = new Book("Great Expectations");
		assertEquals("Great Expectations", b1.title);
		assertEquals("Unknown author", b1.author);
	}
	
	public void testGetPerson(){
		Book b2 = new Book("War and Peace");
		Person p2 = new Person();
		p2.setName("Elvis");
		
		//method that will determine who book is loaned to.
		b2.setPerson(p2);
		
		//get the name of the person who has the book.
		String testName = b2.getPerson().getName();
		assertEquals("Elvis", testName);
	}
}
