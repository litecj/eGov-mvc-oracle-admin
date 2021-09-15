<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="../common/head.jsp"/>

<body>

<h2>Book Update Form</h2>

<form action="<%= application.getContextPath() %>/book/update" method="post">

  <div class="container">
  
  	<label for="bookId"><b>bookId</b></label>
    <input type="text" placeholder="Enter ID" name="bookId" required>
    
    <label for="bookTitle"><b>bookTitle</b></label>
    <input type="text" placeholder="Enter name" name="bookTitle" required>

    <label for="price"><b>price</b></label>
    <input type="text" placeholder="Enter price1" name="price" required>
    
    <label for="pubId"><b>pubId</b></label>
    <input type="text" placeholder="Enter pubId" name="pubId" required>
        
    <button type="submit">UPDATE</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

</form>

</body>
</html>