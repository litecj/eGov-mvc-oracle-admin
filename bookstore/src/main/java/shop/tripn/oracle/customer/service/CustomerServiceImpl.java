package shop.tripn.oracle.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.tripn.oracle.customer.domain.CustomerDto;
import shop.tripn.oracle.mappers.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired CustomerMapper customerMapper;
//	@Override
//	public List<CustomerDto> findAll() {
//		// TODO Auto-generated method stub
//		return customerMapper.findAll();
//	}
//
//	@Override
//	public CustomerDto findById(int custId) {
//		return customerMapper.findById(custId);
//	}
//
//	@Override
//	public List<CustomerDto> findByName(String custName) {
//		return customerMapper.findByName(custName);
//	}
//
//	@Override
//	public List<CustomerDto> findByAddress(String address) {
//		return customerMapper.findByAddress(address);
//	}
//
//	@Override
//	public List<CustomerDto> findByPhone(String phone) {
//		return customerMapper.findByPhone(phone);
//	}
//
//	@Override
//	public void save(CustomerDto customer) {
//		customerMapper.save(customer);
//		
//	}

	@Override
	public void save(CustomerDto t) {
		customerMapper.save(t);	}

	@Override
	public CustomerDto findById(Integer id) {
		return customerMapper.findById(id);	}

	@Override
	public List<CustomerDto> findAll() {
		return customerMapper.findAll();	}

	@Override
	public void update(CustomerDto t) {
		customerMapper.update(t);	}

	@Override
	public void delete(Integer id) {
		customerMapper.delete(id);	}

	@Override
	public List<CustomerDto> findByName(String custName) {
		return customerMapper.findByName(custName);	}

	@Override
	public List<CustomerDto> findByAddress(String address) {
		return customerMapper.findByAddress(address);
	}

	@Override
	public List<CustomerDto> findByPhone(String phone) {
		return customerMapper.findByPhone(phone);
	}


}
