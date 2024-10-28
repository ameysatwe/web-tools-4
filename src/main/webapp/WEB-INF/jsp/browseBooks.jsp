<%--
  Created by IntelliJ IDEA.
  User: ameysatwe
  Date: 28/10/24
  Time: 3:27 pm
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: ameysatwe
  Date: 11/10/24
  Time: 5:39 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: ameysatwe
  Date: 10/10/24
  Time: 7:16 pm
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Browse Movies!</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h1>Movies List</h1>
    <a href="?action=addBooks" class="btn btn-primary mb-3">Add New Book</a>
    <c:if test="${keyword != null}">
        <p>You searched for ${keyword}!</p>
    </c:if>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ISBN</th>
            <th>Title</th>
            <th>Authors</th>
            <th>Price</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach var="book" items="${listBooks}">
            <tr>
                <td>${book.title}</td>
                <td>${book.title}</td>
                <td>${book.authors}</td>
                <td>${book.price}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>


