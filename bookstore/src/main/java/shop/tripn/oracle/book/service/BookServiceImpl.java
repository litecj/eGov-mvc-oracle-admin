package shop.tripn.oracle.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.tripn.oracle.book.domain.BookDto;
import shop.tripn.oracle.mappers.BookMapper;

@Service
public class BookServiceImpl implements BookService {

	@Autowired BookMapper bookMapper;
	@Override
	public List<BookDto> findAll() {
		// TODO Auto-generated method stub
		return bookMapper.findAll();
	}
	@Override
	public List<BookDto> findByPubId(Integer pubId) {
		return bookMapper.findByPubId(pubId);
	}
	@Override
	public List<BookDto> findByBookTitle(String bookTitle) {
		return bookMapper.findByBookTitle(bookTitle);
	}
	@Override
	public List<BookDto> findByPrice(Integer price) {
		return bookMapper.findByPrice(price);
	}
		
	@Override
	public void save(BookDto t) {
		bookMapper.save(t);
		
	}
	@Override
	public BookDto findById(Integer id) {
		// TODO Auto-generated method stub
		return bookMapper.findById(id);
	}
	@Override
	public void update(BookDto t) {
		bookMapper.update(t);
	}
	@Override
	public void delete(Integer id) {
		bookMapper.delete(id);
	}
//	@Override
//	public BookDto findById(int bookId) {
//		return bookMapper.findById(bookId);	}
//	@Override
//	public void add(BookDto book) {
//		bookMapper.add(book);}	
	
}
