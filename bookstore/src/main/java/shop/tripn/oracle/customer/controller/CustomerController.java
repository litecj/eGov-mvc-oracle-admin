package shop.tripn.oracle.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.tripn.oracle.customer.domain.CustomerDto;
import shop.tripn.oracle.customer.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired CustomerService customerService;
	@RequestMapping("/Customer")
	public void findAll() {
		List<CustomerDto> list = customerService.findAll();
		for (CustomerDto c : list) {System.out.println(c.toString());}
	}
	@RequestMapping("/Customer/custId/{custId}")
	public void findById(@PathVariable int custId) {
		CustomerDto customer = customerService.findById(custId);
		System.out.println(customer.toString());
	}
	@RequestMapping("/Customer/custName/{custName}")
	public void findByName(@PathVariable String custName) {
		List<CustomerDto> customers = customerService.findByName(custName);
		for(CustomerDto c : customers) {System.out.println(c.toString());}
	}
	@RequestMapping("/Customer/address/{address}")
	public void findByAddress(@PathVariable String address) {
		List<CustomerDto> customers = customerService.findByAddress(address);
		for(CustomerDto c : customers) {System.out.println(c.toString());}
	}
	@RequestMapping("/Customer/phone/{phone}")
	public void findByPhone(@PathVariable String phone) {
		List<CustomerDto> customers = customerService.findByPhone(phone);
		for(CustomerDto c : customers) {System.out.println(c.toString());}
	}
}
