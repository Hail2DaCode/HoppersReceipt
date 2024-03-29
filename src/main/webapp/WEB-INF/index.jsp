<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hopper's Receipt</title>
</head>
<body>
	<h1>
		Customer Name: <c:out value="${name}"/>
	</h1>
	<p>Item name: <c:out value="${itemName}"></c:out></p>
	<p>Price: <c:out value="${price}"></c:out></p>
	<p>Description: <c:out value="${description}"></c:out></p>
	<p>Vendor: <c:out value="${vendor}"></c:out></p>
	<p>Website: <c:out value="${website}"></c:out></p>
</body>
</html>