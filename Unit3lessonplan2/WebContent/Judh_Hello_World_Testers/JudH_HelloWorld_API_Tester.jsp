<!DOCTYPE HTML>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="judh_hello_world.*" %>
<html>
<head>
	<title>JudH_HelloWorld_API_Tester</title>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<%
	JudH_HelloWorld_API aHelloWorld = new JudH_HelloWorld_API();
	out.print("Output from JudH_HelloWorld_API ToString method <br />" + 
			   aHelloWorld.createHello("Huda", "Sami", "judeh"));
%>
</body>
</html>
