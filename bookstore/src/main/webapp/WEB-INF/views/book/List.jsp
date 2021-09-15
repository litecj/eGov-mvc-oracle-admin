<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="../common/head.jsp"/>

<body>

<h2>Book List Form</h2>

<form action="${contextPath}/book/list" method="post">

  <div class="container">
  
  <!-- 
  	<label for="bookId"><b>bookId</b></label>
    <input type="text" placeholder="Enter ID" name="bookId" required>
    
    <label for="bookTitle"><b>bookTitle</b></label>
    <input type="text" placeholder="Enter name" name="bookTitle" required>

    <label for="price"><b>price</b></label>
    <input type="text" placeholder="Enter address" name="price" required>
    
    <label for="pubId"><b>pubId</b></label>
    <input type="text" placeholder="Enter phone" name="pubId" required>
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