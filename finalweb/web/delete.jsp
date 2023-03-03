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
    <title>deletepage</title>
</head>
<body id="body">
<div style="width: 100%;height: auto ">
    <div style="z-index: 1;position: absolute;left: 1px;top: 1px"><img src="BG/696F3A048B13505A56F8ACB7930EA2F5.jpg" style="width: 100%;height: 100%;"><img/></div>
    <div>
        <form action="Servlet/HomePageServlet" method="post">
            <!--in there i changed the action from servlet/myservlet and metthod from get -->
            <p>
                <input id="tohome" type="submit" value="回主页" style="position: fixed;z-index: 3;height: 25px;width: 200px;margin-left:40%;border-radius: 5px;background: rgba(225,225,225,0.5);border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
            </p>
        </form>
    </div>
        <div style="width: 400px;height: auto; border: 1px solid #000000;margin-left: 35%;margin-top: 10% ;z-index: 10;position: fixed;border-radius: 10px">

        <h2 style="color: #000000;margin-left: 45%;margin-top: 10px">注销</h2>
        <div style="margin-top: 10%;margin-left: 18%">
            <form action="Servlet/DeleteServlet" method="post">
                <!--in there i changed the action from servlet/myservlet and metthod from get -->

                <p><b>注销账号     ：</b><input id="account"  name="uname" placeholder="请输入账号" type="text" style="width: 200px;height: 25px;border: 1px solid #000000;"></p>
                <p><b>注销密码     ：</b><input id="password" name="pwd" placeholder="请输入密码" type="password" style="width: 200px;height: 25px;border: 1px solid #000000"></p>
                <p><b>确认密码     ：</b><input id="password2" name="pwd2" placeholder="请输入密码2" type="password" style="width: 200px;height: 25px;border: 1px solid #000000"></p>
                <p><input id="submit" type="submit" value="确认注销！" style="height: 35px;width: 200px;margin-left: 20%;border-radius: 5px;background: none;border: 1px solid black"
                          onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1"></p>
            </form>
        </div>
    </div>
</div>
</body>
</html>
