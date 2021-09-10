package shop.tripn.oracle.customer.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.tripn.oracle.customer.domain.CustomerDto;

@Component 
public interface CustomerService {
	public List<CustomerDto> findAll();
	public CustomerDto findById(int custId);
	public List<CustomerDto> findByName(String custName);
	public List<CustomerDto> findByAddress(String address);
	public List<CustomerDto> findByPhone(String phone);
}
