<%-- 
    Document   : listUsers
    Created on : May 6, 2013, 2:27:04 AM
    Author     : manu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tabel Utilizatori</h1>
        <table class="usersTable">
            <s:iterator value="usersList">
                <tr>
                    <td><s:property value="id" /></td>
                    <td><s:property value="name" /></td>
                    <td><s:property value="password" /></td>
                </tr>
            </s:iterator>
        </table>
    </body>
</html>
