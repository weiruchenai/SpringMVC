<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>已跳转</title>
    </head>
    <body>
        <h3>成功访问控制器！</h3>
        ${user.toString()}
        <% System.out.println("success.jsp执行了...");%>
    </body>
</html>