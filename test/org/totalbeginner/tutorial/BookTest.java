package org.totalbeginner.tutorial;

import junit.framework.TestCase;

public class BookTest extends TestCase {
	
	public void testBook(){
		Book b1 = new Book("Great Expectations");
		assertEquals("Great Expectations", b1.title);
		assertEquals("Unknown author", b1.author);
	}
}
