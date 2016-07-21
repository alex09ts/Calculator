<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
    <body>
        <form align="center" action="logout" method="GET">
            <c:out value ="Вы вошли как ${user}, "/>
            <input type="Submit" value="Logout"/>
        </form>
    </body>
</html>