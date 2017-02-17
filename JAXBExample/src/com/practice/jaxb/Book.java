/**
 * 
 */
package com.practice.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author awmishra
 *
 */
@XmlRootElement(name = "book")
@XmlType(propOrder = {"title","author","isbn","publicator"})
public class Book {
	
	private String title;
	private String author;
	private String isbn;
	private String publicator;
	
	public String getTitle() {
		return title;
	}
	
	@XmlElement(name = "name")
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	
	@XmlElement(name = "writer")
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	
	@XmlElement(name = "ISBN")
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getPublicator() {
		return publicator;
	}
	
	@XmlElement(name = "publication")
	public void setPublicator(String publicator) {
		this.publicator = publicator;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn
				+ ", publicator=" + publicator + "]";
	}
	
}
