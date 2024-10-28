<%--
  Created by IntelliJ IDEA.
  User: ameysatwe
  Date: 28/10/24
  Time: 9:59 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Movies</title>
</head>
<body>
<h1>Movies</h1>
<a href="movie">Browse Movies</a>
<table border="1">
  <thead>
  <tr>
    <th>Title</th>
    <th>releaseYear</th>
    <th>Director</th>
    <th>Genre</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="movie" items="${movies}">
    <tr>
      <td>${movie.title}</td>
      <td>${movie.releaseYear}</td>
      <td>${movie.director}</td>
      <td>${movie.genre}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
