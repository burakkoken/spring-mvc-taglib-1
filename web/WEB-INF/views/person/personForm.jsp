<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 12.7.2017
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Title</title>
</head>
<body>

    <form:form modelAttribute="personForm" method="post" action="/personFormSubmit">
        <form:input path="name" placeholder="Enter name"/>
        <span style="color:red"><form:errors path="name"/></span>
        <br>
        <form:input path="age" placeholder="Enter age"/>
        <span style="color:red"><form:errors path="age"/></span>
        <br>
        <input type="submit" value="Send Form"/>
    </form:form>

</body>
</html>
