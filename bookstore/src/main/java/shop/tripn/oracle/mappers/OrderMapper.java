package shop.tripn.oracle.mappers;

import java.util.List;
import org.springframework.stereotype.Repository;
import shop.tripn.oracle.order.domain.OrderDto;

@Repository
public interface OrderMapper {
	public List<OrderDto> findAll();
	public OrderDto findById(int orderId);
	public List<OrderDto> findByCustId(int custId);
	public List<OrderDto> findByBookId(int bookId);
	public List<OrderDto> findByOrderPrice(int orderPrice);
	public List<OrderDto> findByOrderDate(String orderDate);
}
