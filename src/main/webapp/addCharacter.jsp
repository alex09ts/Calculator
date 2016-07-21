<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
    <body>
        <%@ include file="header.jsp" %>

        <p align="center"><font size="10"  face="Arial">Exp:  ${exp}  </font></p>

        <table align="center" border="0" cellspacing="0" cellpadding="3">
        <tr>
            <form action="c+" method="POST">
                <td><input type="submit" value="+" style="width:50Px;height:20Px"/></td>
            </form>
            <form action="c-" method="POST">
                <td><input type="submit" value="-" style="width:50Px;height:20Px"/></td>
            </form>
            <form action="cv" method="POST">
                <td><input type="submit" value="v" style="width:50Px;height:20Px"/></td>
            </form>
        </tr>
        </table>
        <br>
        <%@ include file="footer.jsp" %>
    </body>
</html>