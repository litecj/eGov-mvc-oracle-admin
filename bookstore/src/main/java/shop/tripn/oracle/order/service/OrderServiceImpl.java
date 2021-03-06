package shop.tripn.oracle.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.tripn.oracle.mappers.OrderMapper;
import shop.tripn.oracle.order.domain.OrderDto;

@Service

public class OrderServiceImpl implements OrderService{

	@Autowired OrderMapper orderMapper;
//	@Override
//	public List<OrderDto> findAll() {
//		// TODO Auto-generated method stub
//		return orderMapper.findAll();
//	}
//
//	@Override
//	public OrderDto findById(int orderId) {
//		return orderMapper.findById(orderId);
//	}
//
//	@Override
//	public List<OrderDto> findByCustId(int custId) {
//		return orderMapper.findByCustId(custId);
//	}
//
//	@Override
//	public List<OrderDto> findByBookId(int bookId) {
//		return orderMapper.findByBookId(bookId);
//	}
//
//	@Override
//	public List<OrderDto> findByOrderPrice(int orderPrice) {
//		return orderMapper.findByOrderPrice(orderPrice);
//	}
//
//	@Override
//	public List<OrderDto> findByOrderDate(String orderDate) {
//		// TODO Auto-generated method stub
//		return orderMapper.findByOrderDate(orderDate);
//	}
//
//	@Override
//	public void order(OrderDto order) {
//		orderMapper.save(order);

	@Override
	public void save(OrderDto t) {
		orderMapper.save(t);
	}

	@Override
	public OrderDto findById(Integer id) {
		return orderMapper.findById(id);
	}

	@Override
	public List<OrderDto> findAll() {
		return orderMapper.findAll();
	}

	@Override
	public void update(OrderDto t) {
		orderMapper.update(t);
		
	}

	@Override
	public void delete(Integer id) {
		orderMapper.delete(id);		
	}

	@Override
	public List<OrderDto> findByCustId(int custId) {
		return orderMapper.findByCustId(custId);
	}

	@Override
	public List<OrderDto> findByBookId(int bookId) {
		return orderMapper.findByBookId(bookId);
	}

	@Override
	public List<OrderDto> findByOrderPrice(int orderPrice) {
		return orderMapper.findByOrderPrice(orderPrice);
	}

	@Override
	public List<OrderDto> findByOrderDate(String orderDate) {
		return orderMapper.findByOrderDate(orderDate);
	}
		
}


