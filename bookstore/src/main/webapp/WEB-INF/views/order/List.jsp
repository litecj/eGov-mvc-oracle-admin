<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<jsp:include page="../common/head.jsp"/>

<body>

<h2>Order List Form</h2>

<form action="${contextPath}/order/list" method="post">

  <div class="container">
  
  <!-- 
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
   -->
        
    <button type="submit">CHECK</button>

  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>

</body>
</html>