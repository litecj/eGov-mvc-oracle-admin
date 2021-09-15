<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<jsp:include page="../common/head.jsp"/>

<body>

<h2>Publisher List Form</h2>

<form action="${contextPath}/publisher/list" method="post">

  <div class="container">
  
  <!-- 
    <label for="pubId"><b>pubId</b></label>
    <input type="text" placeholder="Enter ID" name="pubId" required>
    
    <label for="pubName"><b>pubName</b></label>
    <input type="text" placeholder="Enter name" name="pubName" required>

    <label for="mgrName"><b>mgrName</b></label>
    <input type="text" placeholder="Enter mgr-Name" name="mgrName" required>
    
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