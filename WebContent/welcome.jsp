<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ChatBot</title>
<style><%@include file="/WEB-INF/welcome.css"%></style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>
	
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if(session.getAttribute("uname") == null) {
			response.sendRedirect("login.jsp");
		}
	%>
	<div class="button">
		<form id='logout-form' action="Logout">
	        <a href="#" class="btn" onclick="document.getElementById('logout-form').submit();">
	            <i class="fa fa-power-off"></i>
	        </a>
		</form>
    </div>
    <div class="bot">
<div id="artibot-1596808499080"></div><script type="text/javascript">!function(t,e){t.artibotApi={l:[],t:[],on:function(){this.l.push(arguments)},trigger:function(){this.t.push(arguments)}};var a=!1,i=e.createElement("script");i.async=!0,i.type="text/javascript",i.src="https://app.artibot.ai/loader.js",e.getElementsByTagName("head").item(0).appendChild(i),i.onreadystatechange=i.onload=function(){if(!(a||this.readyState&&"loaded"!=this.readyState&&"complete"!=this.readyState)){new window.ArtiBot({i:"08187d2d-218d-4264-918b-5d3cecd2b7aa",em:{id:'1596808499080',w:'840',h:'660',sh:true,tb:false}});a=!0}}}(window,document);</script>    </div>
</body>
</html>