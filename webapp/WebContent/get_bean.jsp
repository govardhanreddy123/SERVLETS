<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="/index.jsp"%>


<!DOCTYPE html>
<html>
<jsp:useBean id="obj" class="com.ustglobal.webapp.servlets.Employee"
	scope="application"></jsp:useBean>
<body>
	<h2><%=obj.getId()%></h2>
	<h1><%=obj.getName()%></h1>
	<jsp:include page="/first" />

</body>
</html>