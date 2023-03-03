<%--
  Created by IntelliJ IDEA.
  User: dell123
  Date: 2021/9/19
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>insertpage</title>
</head>
<body id="body">

<div style="z-index: 1;position: fixed;left: 1px;top: 1px"><img src="BG/696F3A048B13505A56F8ACB7930EA2F5.jpg" style="width: 100%;height: 100%;"><img/></div>
<div style="width: 100%;height: 100% ">
    <!--<div style="z-index: 1;position: absolute;left: 1px;top: 1px"><img src="BG/01.jpg" style="width: 100%;height: 100%;"><img/></div>-->

        <div style="width: 400px;height: 400px; border: 1px solid #000000;margin-left: 35%;margin-right: 35%;margin-top: 10% ;z-index: 10;position: relative;border-radius: 10px">
        <h2 style="color: #000000;margin-left: 45%;margin-top: 10px">注册</h2>
        <div style="margin-top: 10%;margin-left: 18%;margin-right: 18%;";>
            <form action="Servlet/InsertServlet" method="post">
                <!--in there i changed the action from servlet/myservlet and metthod from get -->

                <p><b>账号     ：</b><input id="account"  name="uname" placeholder="请输入账号" type="text" style="width: 200px;height: 25px;border: 1px solid #000000;"></p>
                <p><b>密码     ：</b><input id="password" name="pwd" placeholder="请输入密码" type="password" style="width: 200px;height: 25px;border: 1px solid #000000"></p>
                <p><b>确认     ：</b><input id="password2" name="pwd2" placeholder="请确认密码" type="password" style="width: 200px;height: 25px;border: 1px solid #000000"></p>
                <p><b>昵称     ：</b><input id="webname"  name="webname" placeholder="请输入昵称" type="text" style="width: 200px;height: 25px;border: 1px solid #000000;"></p>
                <!--<p><b>邮箱     ：</b><input id="email" name="email" placeholder="请输入email" type="password" style="width: 200px;height: 25px;border: 1px solid #000000"></p>
                -->
                <p><b>邮箱     ：</b><input id="email"  name="email" placeholder="请输入邮箱" type="text" style="width: 200px;height: 25px;border: 1px solid #000000;"></p>
                <p><input id="submit" type="submit" value="确认" style="height: 25px;width: 60px;margin-left: 30%;border-radius: 5px;background: none;border: 1px solid black"
                          onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1"></p>
            </form>
        </div>
    </div>
</div>
</body>
</html>
