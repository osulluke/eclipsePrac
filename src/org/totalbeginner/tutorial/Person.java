package org.totalbeginner.tutorial;

public class Person {
	// fields
	private String name; //name of the person
	private int maximumBooks; //most books the person can checkout
	
	//constructors
	public Person(){
		name = "Unknown name";
		maximumBooks = 3;
	}
	
	//methods
	public String getName(){
		return name;
	}
	
	public void setName(String anyName) {
		this.name = anyName;
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	
}
