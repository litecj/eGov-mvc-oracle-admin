package shop.tripn.oracle.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.tripn.oracle.customer.domain.CustomerDto;
import shop.tripn.oracle.customer.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired CustomerService customerService;
	@Autowired CustomerDto customer;
	
	@RequestMapping(value="/join", method= {RequestMethod.POST})
	public String Join(@RequestParam("custId") int custId,
			@RequestParam("custName") String custName,
			@RequestParam("address") String address,
			@RequestParam("phone") String phone)
	{System.out.println("custId: "+custId);
		System.out.println("custName: "+custName);
		System.out.println("address: "+address);
		System.out.println("phone: "+phone);
		customer = new CustomerDto();
		customer.setCustId(custId);
		customer.setCustName(custName);
		customer.setAddress(address);
		customer.setPhone(phone);
		customerService.save(customer);
		return "Join success";}
	
	@RequestMapping(value="/login", method= {RequestMethod.POST})
	public String login(@RequestParam("custName") String custName) {
		return "Login success";}
	
	@RequestMapping("/list")
	public void findAll() {
		List<CustomerDto> list = customerService.findAll();
		for (CustomerDto c : list) {System.out.println(c.toString());}
	}
	@RequestMapping("/custId/{custId}")
	public void findById(@PathVariable int custId) {
		CustomerDto customer = customerService.findById(custId);
		System.out.println(customer.toString());
	}
	@RequestMapping("/custName/{custName}")
	public void findByName(@PathVariable String custName) {
		List<CustomerDto> customers = customerService.findByName(custName);
		for(CustomerDto c : customers) {System.out.println(c.toString());}
	}
	@RequestMapping("/address/{address}")
	public void findByAddress(@PathVariable String address) {
		List<CustomerDto> customers = customerService.findByAddress(address);
		for(CustomerDto c : customers) {System.out.println(c.toString());}
	}
	@RequestMapping("/phone/{phone}")
	public void findByPhone(@PathVariable String phone) {
		List<CustomerDto> customers = customerService.findByPhone(phone);
		for(CustomerDto c : customers) {System.out.println(c.toString());}
	}
}
