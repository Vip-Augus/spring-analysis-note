<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: JingQ
  Date: 2019/7/13
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book Shop</title>
</head>
<body>
<c:forEach items="${bookList}" var="book">
    <c:out value="${book.name}"/>
    <c:out value="${book.tag}"/>
</c:forEach>
</body>
</html>
