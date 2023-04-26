<!DOCTYPE HTML>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="judh_hello_world.*" %>
<html>
<head>
	<title>VerT_HelloWorld_Tester</title>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<%
	JudH_HelloWorld aHelloWorld = new JudH_HelloWorld();
	out.print("Output from toString() after creating an object using the default constructor method: <br />" + 
			   aHelloWorld.toString());

	JudH_HelloWorld newHelloWorld = new JudH_HelloWorld("Huda", "Sami", "Judeh");
	out.print("<br /><br />" + 
			  "Output from toString() after creating an object using the parameterized constructor method: <br />" + 
			  newHelloWorld.toString()); 
%>
</body>
</html>