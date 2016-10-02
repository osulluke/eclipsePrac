package org.totalbeginner.tutorial;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public void testPerson() {
		Person p1 = new Person();
		assertEquals("Unknown name", p1.getName());
		assertEquals(3, p1.getMaximumBooks());
	}

	public void testSetName() {
		Person p1 = new Person();
		p1.setName("Luke");
		assertEquals("Luke", p1.getName());
	}

	public void testSetMaximumBooks() {
		Person p1 = new Person();
		p1.setMaximumBooks(12);
		assertEquals(12, p1.getMaximumBooks());
	}
}
