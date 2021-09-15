<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="../common/head.jsp"/>

<body>

<h2>User delete Form</h2>

<form action="${contextPath}/customer/delete">

  <div class="container">
  
  	<label for="custId"><b>custId</b></label>
    <input type="text" placeholder="Enter ID" name="custId" required>
    
    <!--<label for="custName"><b>custName</b></label>
    <input type="text" placeholder="Enter name" name="custName" required>

    <label for="address"><b>address</b></label>
    <input type="text" placeholder="Enter address" name="address" required>
    
    <label for="phone"><b>phone</b></label>
    <input type="text" placeholder="Enter phone" name="phone" required>  -->
    
        
    <button type="submit">delete</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

</form>

</body>
</html>