/**
 * 
 */
package com.practice.jaxb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.practice.jaxb.Book;
import com.practice.jaxb.BookStore;

/**
 * @author awmishra
 *
 */
public class JAXBTest {
	
	public static final String XML_FILE = "./bookStore.xml";
	
	/**
	 * @param args
	 * @throws JAXBException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		List<Book> bookList = new ArrayList<Book> ();
		
		Book book1 = new Book();
		book1.setTitle("AIC");
		book1.setAuthor("Mr Dharni");
		book1.setPublicator("TMH");
		book1.setIsbn("123456789");
		bookList.add(book1);
		
		Book book2 = new Book();
		book2.setTitle("DIC");
		book2.setAuthor("Mr RG Gupta");
		book2.setPublicator("Pearson");
		book2.setIsbn("987654321");
		
		bookList.add(book2);
		
		BookStore bookStore = new BookStore();
		bookStore.setLocation("HazratGanj");
		bookStore.setStoreName("Books N Books");
		bookStore.setBookList(bookList);
		
	    JAXBContext jc = JAXBContext.newInstance(BookStore.class);
		Marshaller mu = jc.createMarshaller();
		mu.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		mu.marshal(bookStore, System.out);
		mu.marshal(bookStore, new File(XML_FILE));
		
		Unmarshaller um = jc.createUnmarshaller();
		Object obj = um.unmarshal(new FileReader(XML_FILE));
		BookStore bookStoreRead = (BookStore) obj;
		List<Book> list = bookStoreRead.getBookList();
		
		for(Book book : list) {
			System.out.println("Book Available - Name: " + book.getTitle() + " Written By : " + book.getAuthor());
		}
		
	}

}
