<%--
  Created by IntelliJ IDEA.
  User: ameysatwe
  Date: 27/10/24
  Time: 2:56 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Movies</title>
</head>
<body>
<h1>Movies</h1>
<form action="" method="post">
  <input type="text" name="keyword" placeholder="Search by Title, Actor or Director">
  <input type="hidden" name="action" value="searchMovie">
  <input type="submit" value="Search">
</form>

<a href="?action=addMovieForm">Add New Movie</a>

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

