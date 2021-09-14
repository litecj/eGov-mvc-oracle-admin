package shop.tripn.oracle.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import shop.tripn.oracle.book.domain.BookDto;
import shop.tripn.oracle.book.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController{
	
	@Autowired BookService bookService;
	@Autowired BookDto book;
	
//	@RequestMapping(value="/add", method= {RequestMethod.POST})
//	public String save (@RequestBody BookDto t) {
//		System.out.println("bookId : "+bookId);
//		System.out.println("bookTitle : "+bookTitle);
//		System.out.println("price : "+price);
//		System.out.println("pubId : "+pubId);
////		book = new BookDto();
//		book.setBookId(bookId);
//		book.setBookTitle(bookTitle);
//		book.setPrivce(price);
//		book.setPubId(pubId);
//		bookService.save(book);
//		return "Save Success";}
	@RequestMapping(value="/add", method= RequestMethod.POST)
	public String save(BookDto t) {
		bookService.save(t);
		System.out.println(t.toString());
		return "Save Success";	}
		
	@RequestMapping("/list")
	public void findAll() {
		List<BookDto> list = bookService.findAll();
		for(BookDto b : list) {System.out.println(b.toString());}}
	
	@RequestMapping("/detail")
	public void findById(@PathVariable Integer id) {
		bookService.findById(id);
		System.out.println(id.toString());}
	
	@RequestMapping(value="/update", method= {RequestMethod.POST})
	public String update(BookDto t) {
		System.out.println(t.toString());
		System.out.println("---------------------------");
		bookService.update(t);
		System.out.println(t.toString());
		return "update Success";
	}

	@RequestMapping("/delete")
	public void delete(Integer bookId) {
		bookService.delete(bookId);
		System.out.println("delete " + bookId);
	}
	
	
	@RequestMapping("/pubid/{pubId}")
	public void findByPubId(@PathVariable Integer pubId) {
		List<BookDto> books = bookService.findByPubId(pubId);
		for(BookDto b : books) {System.out.println(b.toString());}
	}
	
	@RequestMapping("/bookTitle/{bookTitle}")
	public void findByBookTitle(@PathVariable String bookTitle) {
		List<BookDto> books = bookService.findByBookTitle(bookTitle);
		for(BookDto b : books) {System.out.println(b.toString());}
	}
	
	@RequestMapping("/price/{price}")
	public void findByPrice(@PathVariable Integer price) {
		List<BookDto> books = bookService.findByPrice(price);
		for(BookDto b : books) {System.out.println(b.toString());}
	}


}
