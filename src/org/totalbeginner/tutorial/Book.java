package org.totalbeginner.tutorial;

public class Book {

	public String title;
	public String author;

	public Book(String string) {
		// TODO Auto-generated constructor stub
		this.title = string;
		this.author = "Unknown author";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

}
