<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
    <body>
        <form action="login" method="POST">
            <table>
                <tr>
                    <td>Login: </td>
                    <td><input type="text" name="login"></td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit" /></td>
                </tr>
            </table>

        </form>
        <br><br>
    </body>
</html>