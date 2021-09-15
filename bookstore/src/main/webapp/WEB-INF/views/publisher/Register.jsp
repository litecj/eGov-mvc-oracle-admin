<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<jsp:include page="../common/head.jsp"/>

<body>

<h2>Publisher Register Form</h2>

<form action="${contextPath}/publisher/register" method="post">
	<div class="imgcontainer">
    <img src="img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
  
  	<label for="pubId"><b>pubId</b></label>
    <input type="text" placeholder="Enter ID" name="pubId" required>
    
    <label for="pubName"><b>pubName</b></label>
    <input type="text" placeholder="Enter name" name="pubName" required>

    <label for="mgrName"><b>mgrName</b></label>
    <input type="text" placeholder="Enter mgr-Name" name="mgrName" required>
    
    <label for="phone"><b>phone</b></label>
    <input type="text" placeholder="Enter phone" name="phone" required>
        
    <button type="submit">register</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>

</body>
</html>