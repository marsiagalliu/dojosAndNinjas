<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
<h1><c:out>${dojo.location}</c:out></h1>
<table class="table">
    <thead>
    <tr>
        <th scope="col">First Name</th>
        <th scope="col">Last Name</th>
        <th scope="col">Age</th>
    </tr>
    </thead>
    <tbody>
    </tbody>
    <c:forEach var="ninja" items="${dojo.ninjas}">
        <tr>
            <td> <c:out value="${ninja.firstName}"></c:out> </td>
            <td> <c:out value="${ninja.lastName}"></c:out> </td>
            <td> <c:out value="${ninja.age}"></c:out> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>