<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<body>
    <%@ include file="header.jsp" %>

    <p align="center"><font size="10"  face="Arial">Exp:  ${exp}  </font></p>

    <table align="center" border="0" cellspacing="0" cellpadding="3">
        <tr>
            <form action="n1" method="POST">
                <td><input type="submit" value="1" style="width:50Px;height:20Px"/></td>
            </form>
            <form action="n2" method="POST">
                <td><input type="submit" value="2" style="width:50Px;height:20Px"/></td>
            </form>
            <form action="n3" method="POST">
                <td><input type="submit" value="3" style="width:50Px;height:20Px"/></td>
            </form>
        </tr>
        <tr>
            <form action="n4" method="POST">
                <td><input type="submit" value="4" style="width:50Px;height:20Px"/></td>
            </form>
            <form action="n5" method="POST">
                <td><input type="submit" value="5" style="width:50Px;height:20Px"/></td>
            </form>
            <form action="n6" method="POST">
                <td><input type="submit" value="6" style="width:50Px;height:20Px"/></td>
            </form>
        </tr>
        <tr>
            <form action="n7" method="POST">
                <td><input type="submit" value="7" style="width:50Px;height:20Px"/></td>
            </form>
            <form action="n8" method="POST">
                <td><input type="submit" value="8" style="width:50Px;height:20Px"/></td>
            </form>
            <form action="n9" method="POST">
                <td><input type="submit" value="9" style="width:50Px;height:20Px"/></td>
            </form>
        </tr>
        <tr>
            <td></td>
            <form action="n0" method="POST">
                <td><input type="submit" value="0" style="width:50Px;height:20Px"/></td>
            </form>
            <td></td>
        </tr>
    </table>
    <br>
    <%@ include file="footer.jsp" %>
</body>
</html>