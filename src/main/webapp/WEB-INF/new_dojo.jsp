<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>New Dojo</title>
</head>
<body>
<h1>New Dojo</h1>
<%--@elvariable id="dojo" type="java"--%>
<form:form action="/dojos" method="post" modelAttribute="dojo">
    <p>
        <form:label path="location">Name: </form:label>
        <form:errors path="location" class="text-danger"/>
        <form:input path="location"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>