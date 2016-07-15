<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>!!!Sudoku generator!!!</h3>
<div style="width:110px; margin:0 auto; border:1px solid black; padding:10px"> 		
		<c:forEach var="map" items="${sudokumap}">
			<c:out value="${map.value}"/>
		</c:forEach>
	</div>	
</body>
</html>