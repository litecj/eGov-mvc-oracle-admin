package shop.tripn.oracle.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.tripn.oracle.book.domain.BookDto;
import shop.tripn.oracle.book.service.BookService;
import shop.tripn.oracle.mappers.BookMapper;

@Controller
public class BookController {
	
	@Autowired BookService bookService;
	
	@RequestMapping("/books")
	public void findAll() {
		List<BookDto> list = bookService.findAll();
		for(BookDto b : list) {System.out.println(b.toString());}
	}
	
	@RequestMapping("/books/bookid/{bookId}")
	public void findById(@PathVariable int bookId) {
		BookDto book = bookService.findById(bookId);
		System.out.println(book.toString());
	}
	
	@RequestMapping("/books/pubid/{pubId}")
	public void findByTitle(@PathVariable int pubId) {
		List<BookDto> books = bookService.findByPubId(pubId);
		for(BookDto b : books) {System.out.println(b.toString());}
	}
	
	@RequestMapping("/books/bookTitle/{bookTitle}")
	public void findByBookTitle(@PathVariable String bookTitle) {
		List<BookDto> books = bookService.findByBookTitle(bookTitle);
		for(BookDto b : books) {System.out.println(b.toString());}
	}
	
	@RequestMapping("/books/price/{price}")
	public void findByPrice(@PathVariable int price) {
		List<BookDto> books = bookService.findByPrice(price);
		for(BookDto b : books) {System.out.println(b.toString());}
	}
}
