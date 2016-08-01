<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
    <body>
        <p align="center">
            <c:out value ="Вы вошли как ${user}, "/>
            <a href="logout"><button type="button">Log out</button></a>
        </p>
    </body>
</html>