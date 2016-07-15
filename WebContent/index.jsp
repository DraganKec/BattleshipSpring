<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/styles.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>

</head>
<body>

	<form method="POST" action="battleship">
		<input type="submit" value="Generate">
		<hr>
		<div class="container">
			<c:forEach items="${battleshipMap}" var="row">
				<tr>
					<div class="first">
						<c:forEach items="${row}" var="cell">
							<div class="${cell=='6' ? 'black':'white'}">${cell}"</div>
						</c:forEach>
					</div>
				</tr>
			</c:forEach>

		</div>

	</form>
	<form method="POST" action="sudoku">
		<input type="submit" value="Sudoku">
	</form>
</body>
</html>