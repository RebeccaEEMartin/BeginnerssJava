package org.totalbeginner.tutorial;

import junit.framework.TestCase;

public class BookTest extends TestCase {

	public void testBook() {
		Book b1 = new Book("Great Expectations");
		assertEquals("Great Expectations", b1.title);
		assertEquals("unknown author", b1.author);
		
	}
	
	public void testGetPerson() {
		Book b2 = new Book("War And Peace");
		Person p2 = new Person();
		p2.setName("Elvis");
		
		// method to say book is loaned to this person
		b2.setPerson(p2);
		
		// get name of person who has book
//		Person testPerson = b2.getPerson();
//		String testName = testPerson.getName();
		String testName = b2.getPerson().getName();
		
		assertEquals("Elvis", testName);
	}
}
