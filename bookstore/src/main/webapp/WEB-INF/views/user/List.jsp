<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<jsp:include page="../common/head.jsp"/>

<body>

<h2>User List Form</h2>

<form action="${contextPath}/customer/list" method="post">

  <div class="container">
  
  <!-- 
   	<label for="custId"><b>custId</b></label>
    <input type="text" placeholder="Enter ID" name="custId" required>
    
    <label for="custName"><b>custName</b></label>
    <input type="text" placeholder="Enter name" name="custName" required>

    <label for="address"><b>address</b></label>
    <input type="text" placeholder="Enter address" name="address" required>
    
    <label for="phone"><b>phone</b></label>
    <input type="text" placeholder="Enter phone" name="phone" required>
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