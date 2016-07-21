<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<body>
    <%@ include file="header.jsp" %>
    <p align="center"><font size="10"  face="Arial">Exp:  ${exp}  </font></p>
    <br>
    <form align="center" action="clear" method="POST">
        <input type="submit" value="Clear the Expression"/>
    </form>
    <br>
    <%@ include file="footer.jsp" %>
</body>
</html>