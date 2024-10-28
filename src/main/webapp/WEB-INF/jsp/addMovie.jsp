<%--
  Created by IntelliJ IDEA.
  User: ameysatwe
  Date: 27/10/24
  Time: 10:09 pm
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Add Movie</title>
</head>
<body>
<h1>Add Movie</h1>
<form action="movie" method="post">
    <label>Title:</label>
    <input type="text" name="title"><br>

    <label>Director:</label>
    <input type="text" name="director"><br>
    <label>Genre:</label>
    <input type="text" name="genre"><br>
    <label>Release Year:</label>
    <input type="text" name="releaseYear"><br>
    <input type="hidden" name="action" value="addMovie">
    <input type="submit" value="Add Movie">
</form>
</body>
</html>
