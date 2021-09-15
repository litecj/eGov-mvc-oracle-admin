<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="../common/head.jsp"/>

<body>

<h2>Order Update Form</h2>

<form action="${contextPath}/order/update" method="post">

  <div class="container">
  
  	<label for="orderId"><b>orderId</b></label>
    <input type="text" placeholder="Enter ID" name="orderId" required>
    
    <label for="custId"><b>custId</b></label>
    <input type="text" placeholder="Enter custId" name="custId" required>

    <label for="bookId"><b>bookId</b></label>
    <input type="text" placeholder="Enter bookId" name="bookId" required>
    
    <label for="orderPrice"><b>orderPrice</b></label>
    <input type="text" placeholder="Enter orderPrice" name="orderPrice" required>
    
    <label for="orderDate"><b>orderDate</b></label>
    <input type="text" placeholder="Enter orderDate" name="orderDate" required>
        
    <button type="submit">UPDATE</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

</form>

</body>
</html>