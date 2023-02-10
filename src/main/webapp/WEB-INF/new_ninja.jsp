<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>New Ninja</title>
</head>
<body>
<h1>New Ninja</h1>
<%--@elvariable id="ninja" type="java"--%>
<form:form action="/ninjas/${ninja.id}" method="post" modelAttribute="ninja">
    <form:label path="dojo">Dojo : </form:label>
    <form:select path="dojo">
        <c:forEach var="dojo" items="${dojo}">
            <option value="${dojo.id}">${dojo.location}</option>
        </c:forEach>
    </form:select>
    <form:label path="firstName">First Name :</form:label>
    <form:input type="text" path="firstName"></form:input>
    <form:label path="lastName">Last Name :</form:label>
    <form:input type="text" path="lastName"></form:input>
    <form:label path="age">Age :</form:label>
    <form:input type="number" path="age"></form:input>
    <input type="submit" value="Create">
</form:form>
</body>
</html>