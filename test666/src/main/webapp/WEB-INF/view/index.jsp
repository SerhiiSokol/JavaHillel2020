<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>

<h1>Hello from Java Vision!</h1><br />

<h2>Все пользователи</h2><br />

<c:forEach var="user" items="${requestScope.st}">
    <ul>

        <li>Имя: <c:out value="${user.getFull_name()}"/></li>

        <li>Возраст: <c:out value="${user.getCod_Student()}"/></li>
    </ul>
    <hr />

</c:forEach>

<h2>Создание нового пользователя</h2><br />

<form method="post" action="">

    <label><input type="text" name="name"></label>Имя<br>

    <label><input type="number" name="age"></label>Возраст<br>

    <input type="submit" value="Ok" name="Ok"><br>
</form>

</body>
</html>
