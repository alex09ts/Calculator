<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
    <body>
        <table align="center" border="0" cellspacing="0" cellpadding="6">
            <tr>
            <form action="addCharacter" method="GET">
            <td><input type="submit" value="Add char" style="width:100Px;height:20Px"/></td>
            </form>
            <form action="addNumber" method="GET">
            <td><input type="submit" value="Add value" style="width:100Px;height:20Px"/></td>
            </form>
            </tr>

            <tr>
            <form action="expression" method="GET">
            <td><input type="submit" value="Expression" style="width:100Px;height:20Px"/></td>
            </form>
            <form action="result" method="GET">
            <td><input type="submit" value="Result" style="width:100Px;height:20Px"/></td>
            </form>
            </tr>
        </table>
    </body>

</html>