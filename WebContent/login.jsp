<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style><%@include file="/WEB-INF/stylee.css"%></style>

</head>
<body>

	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if(session.getAttribute("uname") != null) {
			response.sendRedirect("welcome.jsp");
		}
	%>
<div class="page">
  <div class="container">
    <div class="left">
      <div class="login">ChatBot Login</div>
      <div class="eula">Use the credentials provided by the bank</div>
    </div>
    <div class="right">
      <svg viewBox="0 0 320 300">
        <defs>
          <linearGradient
                          inkscape:collect="always"
                          id="linearGradient"
                          x1="13"
                          y1="193.49992"
                          x2="307"
                          y2="193.49992"
                          gradientUnits="userSpaceOnUse">
            <stop
                  style="stop-color:#ff00ff;"
                  offset="0"
                  id="stop876" />
            <stop
                  style="stop-color:#ff0000;"
                  offset="1"
                  id="stop878" />
          </linearGradient>
        </defs>
        <path d="m 40,120.00016 239.99984,-3.2e-4 c 0,0 24.99263,0.79932 25.00016,35.00016 0.008,34.20084 -25.00016,35 -25.00016,35 h -239.99984 c 0,-0.0205 -25,4.01348 -25,38.5 0,34.48652 25,38.5 25,38.5 h 215 c 0,0 20,-0.99604 20,-25 0,-24.00396 -20,-25 -20,-25 h -190 c 0,0 -20,1.71033 -20,25 0,24.00396 20,25 20,25 h 168.57143" />
      </svg>
      <form class="form" action='Login' autocomplete="off">
        <label for="user">User Name</label>
        <input type="text" name="uname" id="user">
        <label for="password">Password</label>
        <input type="password" name="pass" id="password">
        <input type="submit" id="submit" value="Submit">
      </form>
    </div>
  </div>
</div>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/animejs/2.0.2/anime.js"></script>

	<script src="${pageContext.request.contextPath}/resources/login.js"></script>
	
	
</body>
</html>