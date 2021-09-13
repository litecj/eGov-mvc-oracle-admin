package shop.tripn.oracle.mappers;

import java.util.List;
import org.springframework.stereotype.Repository;
import shop.tripn.oracle.customer.domain.CustomerDto;

@Repository
public interface CustomerMapper {
	public List<CustomerDto> findAll();
	public CustomerDto findById(int custId);
	public List<CustomerDto> findByName(String custName);
	public List<CustomerDto> findByAddress(String address);
	public List<CustomerDto> findByPhone(String phone);
	public void save(CustomerDto customer);
}
