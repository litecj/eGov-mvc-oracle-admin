package shop.tripn.oracle.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.tripn.oracle.order.domain.OrderDto;
import shop.tripn.oracle.order.service.OrderService;

@Controller
public class OrderController {
	@Autowired OrderService orderService;
	@RequestMapping("/order")
	public void findAll() {
		List<OrderDto> list = orderService.findAll();
		for (OrderDto o : list) {System.out.println(o.toString());}
	}
	@RequestMapping("/order/orderId/{orderId}")
	public void findById(@PathVariable int orderId) {
		OrderDto orderDto = orderService.findById(orderId);
		System.out.println(orderDto.toString());
	}
	@RequestMapping("/order/custId/{custId}")
	public void findByCustId(@PathVariable int custId) {
		List<OrderDto> orders = orderService.findByCustId(custId);
		for (OrderDto o : orders) {System.out.println(o.toString());}
	}
	@RequestMapping("/order/bookId/{bookId}")
	public void findByBookId(@PathVariable int bookId) {
		List<OrderDto> orders = orderService.findByBookId(bookId);
		for (OrderDto o : orders) {System.out.println(o.toString());}
	}
	@RequestMapping("/order/orderPrice/{orderPrice}")
	public void findByOrderPrice(@PathVariable int orderPrice) {
		List<OrderDto> orders = orderService.findByOrderPrice(orderPrice);
		for (OrderDto o : orders) {System.out.println(o.toString());}
	}
	@RequestMapping("/order/orderDate/{orderDate}")
	public void findByOrderDate(@PathVariable String orderDate) {
		List<OrderDto> orders = orderService.findByOrderDate(orderDate);
		for (OrderDto o : orders) {System.out.println(o.toString());}
	}
}
