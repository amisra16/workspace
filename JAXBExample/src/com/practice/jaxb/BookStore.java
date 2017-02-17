/**
 * 
 */
package com.practice.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author awmishra
 *
 */

@XmlRootElement(namespace = "www.google.com")
@XmlType(propOrder = {"storeName","location","bookList"})
public class BookStore {
	
	private String storeName;
	private String location;
	
	private List<Book> bookList;

	public String getStoreName() {
		return storeName;
	}

	@XmlElement(name = "StoreName")
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getLocation() {
		return location;
	}

	@XmlElement(name = "Location")
	public void setLocation(String location) {
		this.location = location;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	@XmlElementWrapper(name = "BookDetails")
	@XmlElement(name = "Book")
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "BookStore [storeName=" + storeName + ", location=" + location
				+ ", bookList=" + bookList + "]";
	}
}
