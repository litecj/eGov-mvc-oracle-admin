<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>

<body>

<h2>Book Delete Form</h2>

<form action="${contextPath}/book/delete" >

  <div class="container">
  
  	<label for="bookId"><b>bookId</b></label>
    <input type="text" placeholder="Enter ID" name="bookId" required>
    
    <!-- <label for="bookTitle"><b>bookTitle</b></label>
    <input type="text" placeholder="Enter name" name="bookTitle" required>

    <label for="price"><b>price</b></label>
    <input type="text" placeholder="Enter address" name="price" required>
    
    <label for="pubId"><b>pubId</b></label>
    <input type="text" placeholder="Enter phone" name="pubId" required>  -->
        
    <button type="submit">Delete</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

</form>

</body>
</html>