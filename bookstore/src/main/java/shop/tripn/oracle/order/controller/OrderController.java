package shop.tripn.oracle.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import shop.tripn.oracle.order.domain.OrderDto;
import shop.tripn.oracle.order.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired OrderService orderService;
	@Autowired OrderDto order;
	
	@RequestMapping(value="/order", method= {RequestMethod.POST})
	public String add(@RequestParam("orderId") int orderId,
			@RequestParam("custId") int custId,
			@RequestParam("bookId") int bookId,
			@RequestParam("orderPrice") int orderPrice,
			@RequestParam("orderDate") String orderDate)
	{System.out.println("orderId: "+orderId);
		System.out.println("custId: "+custId);
		System.out.println("bookId: "+bookId);
		System.out.println("orderPrice: "+orderPrice);
		System.out.println("orderDate: "+orderDate);
		order.setOrderId(orderId);
		order.setCustId(custId);
		order.setBookId(bookId);
		order.setOrderPrice(orderPrice);
		order.setOrderDate(orderDate);
		orderService.order(order);
		return "Order success";}
	
	@RequestMapping("/list")
	public void findAll() {
		List<OrderDto> list = orderService.findAll();
		for (OrderDto o : list) {System.out.println(o.toString());}
	}
	@RequestMapping("/orderId/{orderId}")
	public void findById(@PathVariable int orderId) {
		OrderDto orderDto = orderService.findById(orderId);
		System.out.println(orderDto.toString());
	}
	@RequestMapping("/custId/{custId}")
	public void findByCustId(@PathVariable int custId) {
		List<OrderDto> orders = orderService.findByCustId(custId);
		for (OrderDto o : orders) {System.out.println(o.toString());}
	}
	@RequestMapping("/bookId/{bookId}")
	public void findByBookId(@PathVariable int bookId) {
		List<OrderDto> orders = orderService.findByBookId(bookId);
		for (OrderDto o : orders) {System.out.println(o.toString());}
	}
	@RequestMapping("/orderPrice/{orderPrice}")
	public void findByOrderPrice(@PathVariable int orderPrice) {
		List<OrderDto> orders = orderService.findByOrderPrice(orderPrice);
		for (OrderDto o : orders) {System.out.println(o.toString());}
	}
	@RequestMapping("/orderDate/{orderDate}")
	public void findByOrderDate(@PathVariable String orderDate) {
		List<OrderDto> orders = orderService.findByOrderDate(orderDate);
		for (OrderDto o : orders) {System.out.println(o.toString());}
	}
}
