<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/7/13
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Day2</title>
        <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
    </head>
    <body>
        <a href="/response/testString">responseString</a><br>
        <a href="/response/testVoid">responseVoid</a><br>
        <h3>json响应</h3>
        <button id="button1">json</button>

        <script>
            $(function () {
                $('#button1').click(function () {
                    //alert("111");
                    $.ajax({
                        url: "/response/testJson",
                        contentType: "application/json; charset=UTF-8",
                        data_type: "json",
                        data: JSON.stringify({"name": "xiaogao高", "age" : "24"}),
                        type: 'post',
                        success:function (data) {
                            console.log(data);
                        }
                    });
                });
            });
        </script>
    </body>
</html>
