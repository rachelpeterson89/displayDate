<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Display Date</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/date.js"></script>
</head>

<body onload="helloDateTemplate()">
	<h1>The current date is:</h1>
	<h2 id="dateh2"><c:out value="${formattedDate}"/></h2>
</body>
</html>