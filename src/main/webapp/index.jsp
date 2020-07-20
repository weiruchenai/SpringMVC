<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/7/13
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>QuickStart</title>
    </head>
    <body>
        <h2>入门程序</h2>
        <a href="/test/hello">点击跳转</a>

        <h3>请求参数绑定</h3>
        <a href="/param/paramTest?user=wdc&password=12345" >请求参数绑定入门</a>
        <form action="/param/paramBean" method="post">
            姓名:<input type="text" name="user.name"/><br/>
            年龄:<input type="text" name="user.age"/><br/>
            金额:<input type="text" name="money"/><br>
            账户:<input type="text" name="account"/><br>
            <input type="submit" name=""/><br>
        </form>
        <h3>常用注解测试</h3>
        <a href="/annotation/annotationTest/PathVariable">PathVariable</a><br>

        <a href="/annotation/save_SessionAttributes">save_SessionAttributes</a>
        <a href="/annotation/get_SessionAttributes">get_SessionAttributes</a>
        <a href="/annotation/delete_SessionAttributes">delete_SessionAttributes</a>
    </body>
</html>