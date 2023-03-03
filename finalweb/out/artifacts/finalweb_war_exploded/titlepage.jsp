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
<%
%>
<body id="body">
<div style="width: 100%;height: 100% ">
    <div style="z-index: 1;position: fixed;left: 1px;top: 1px"><img src="BG/696F3A048B13505A56F8ACB7930EA2F5.jpg" style="width: 100%;height: 100%;"><img/></div>

        <div style="background-color:rgba(225,225,225,0.5);width: 400px;height: 300px; border: 1px solid #000000;margin-left: 35%;margin-top: 10% ;z-index: 10;position: relative;border-radius: 10px">
            <div style="margin-top: 10%;margin-left: 18%">
                <div style="margin-left: 16%">
                <h2 style="color: #000000;margin-top: 10px">主页文章设置</h2>
                </div>
            <form action="Servlet/SolveTitleServlet" method="post">
                <div style="position:relative;">
                <span style="width:28px;overflow:hidden;">
                    <select name="fristid"   style="width:250px;height: 25px" >
                    <option selected="selected">请选择首页板块</option>
                    <option value="1">今日热点</option>
                    <option value="2">官方推荐</option>
                    </select>
                </span>
                    <%//session.setAttribute("fristid",fristid);%>
                </div>
                <br>
                <div style="position:relative;" >
                <span style="width:28px;overflow:hidden;">
                    <select name="secondid"  style="width:250px;height: 25px" >
                    <option selected="selected">请选择板块排序</option>
                    <option value="1"> 内容01 </option>
                    <option value="2"> 内容02 </option>
                    <option value="3"> 内容03 </option>
                    <option value="4"> 内容04 </option>
                    <option value="5"> 内容05 </option>
                    </select>
                </span>
                </div>
                <!--in there i changed the action from servlet/myservlet and metthod from get -->

                <!--<p><b>首级代号：</b><input id="fristid"  name="fristid" placeholder="请输入首级代号" type="text" style="width: 200px;height: 25px;border: 1px solid #000000;"></p>
                <p><b>次级代号：</b><input id="secondid" name="secondid" placeholder="请输入次级代号" type="text" style="width: 200px;height: 25px;border: 1px solid #000000"></p>
                -->
                <p><b>文章代号：</b><input id="titletextid" name="titletextid" placeholder="请输文章代号" type="text" style="width: 170px;height: 25px;border: 1px solid #000000"></p>
                <p>
                    <input id="submit" type="submit" value="确认" style="height: 25px;width: 60px;margin-left:30%;border-radius: 5px;background: none;border: 1px solid black"
                          onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
                </p>
            </form>
                <form action="Servlet/HomePageServlet" method="post">
                    <!--in there i changed the action from servlet/myservlet and metthod from get -->
                    <p>
                        <input id="tohome" type="submit" value="回主页" style="height: 25px;width: 60px;margin-left:30%;border-radius: 5px;background: none;border: 1px solid black"
                               onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
                    </p>
                </form>
        </div>
    </div>
</div>
</body>
</html>
