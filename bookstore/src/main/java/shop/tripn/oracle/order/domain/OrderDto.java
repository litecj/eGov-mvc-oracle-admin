package shop.tripn.oracle.order.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class OrderDto {
	private int orderId, custId, bookId, orderPrice;
	private String orderDate;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		
		return String.format("주문 ID: %d, 고객 ID: %d, 책 ID: %d, 책 금액: %d, 구매 일자: %s", orderId, custId, bookId, orderPrice, orderDate);
	}
}
