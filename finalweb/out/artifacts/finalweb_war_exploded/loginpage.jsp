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
    <title>mainpage</title>
</head>
<body id="body">
<div style="width: 100%;height: 100% ">
        <!--<div style="z-index: 1;position: fixed;left: 1px;top: 1px"><img src="BG/01.jpg" style="width: 100%;height: 100%;"><img/></div>-->
    <div style="z-index: 1;position: fixed;left: 1px;top: 1px"><img src="BG/20D39$%60N%60OQWL4DYS$2QTPJ.png" style="width: 100%;height: 100%;"><img/></div>

    <div style="width: 400px;height: 300px; border: 1px solid #000000;margin-left: 60%;margin-top: 15% ;z-index: 10;position: fixed;border-radius: 10px">
    <h2 style="color: #000000;margin-left: 45%;margin-top: 10px">登陆</h2>
    <div style="margin-top: 10%;margin-left: 18%">
        <form action="Servlet/LoginServlet" method="post">
            <!--in there i changed the action from servlet/myservlet and metthod from get -->

                <p><b>账号：</b><input id="userid"  name="userid" placeholder="请输入账号" type="text" style="width: 200px;height: 25px;border: 1px solid #000000;"></p>
                <p><b>密码：</b><input id="password" name="pwd" placeholder="请输入密码" type="password" style="width: 200px;height: 25px;border: 1px solid #000000"></p>
                <p>
                    <input id="submit" type="submit" value="登陆" style="height: 25px;width: 60px;margin-left:30%;border-radius: 5px;background: none;border: 1px solid black"
                          onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
                </p>
            </form>
            <form action="Servlet/ToInsertServlet" method="post">
                <p>
                    <input id="submit2" type="submit" value="注册" style="height: 25px;width: 60px;margin-left:30%;border-radius: 5px;background: none;border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
                </p>
            </form>
        </div>
        <div>
                <form action="Servlet/HomePageServlet" method="post">
                    <p>
                        <input id="submit3" type="submit" value="先随便看看吧~" style="height: 25px;width: 200px;margin-left:27%;border-radius: 5px;background: none;border: 1px solid black"
                               onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
                    </p>
                </form>
        </div>
    </div>
</div>
</body>
</html>
