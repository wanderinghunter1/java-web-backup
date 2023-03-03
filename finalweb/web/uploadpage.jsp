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
    <title>uplode</title>
</head>
<body id="body">
<div style="z-index: 1;position: fixed;left: 1px;top: 1px"><img src="BG/266C95185AA164F44D3FB7CAA3577C50.jpg" style="width: 100%;height: 100%;"><img/></div>
<div style="background:rgba(225,225,225,0.5);z-index:2;width: 100%;height: auto ">

    <div> <!--style="z-index: 1;position: absolute;left: 1px;top: 1px"><img src="BG/01.jpg" style="width: 100%;height: 100%;"><img/></div>-->
    <div style="background:rgba(225,225,225,0.5);z-index:2;width: 60%;height:auto; border: 1px solid #000000;margin :0 auto;;z-index: 10;position: relative;border-radius: 10px">
        <h2 style="color: #000000;margin-left: 45%;margin-top: 10px">投稿！</h2>
            <form action="Servlet/UpLoadServlet" method="get">
                <!--<p><input id="uploadtitle"  name="uploadtitle" placeholder="在这里输入标题内容哦~" type="text" style="word-wrap:break-word; word-break:break-all; height:1000px ;width: 700px; border: 1px solid #000000;"></p>
                -->
                <p style="position:relative;">
                <span style="margin-left:100px;  width:1000px;overflow:hidden;">
                    <select name="selectzoneid"  style="width:800px;margin-left: 5%;" >
                        <option selected="selected">请选择首页板块</option>
                        <option value="3">竞技体育</option>
                        <option value="4">人文历史</option>
                        <option value="5">旅游自然</option>
                        <option value="6">影音世界</option>
                        <option value="7">娱乐音乐</option>
                        <option value="8">情感天地</option>
                        <option value="9">生活琐碎</option>
                        <option value="10">时事新闻</option>

                    </select>
                </span>
                    <%//session.setAttribute("fristid",fristid);%>
                </p>
        <p><textarea rows="2" cols="50" name="uploadtitle" placeholder="在这里输入标题内容哦~"style="margin-left: 10%; height:20px ;width: 900px; border: 1px solid #000000;"></textarea></p>
        <p><textarea rows="20" cols="50" name="uploadtext" placeholder="在这里输入投稿内容哦~"style="margin-left: 10%; height:700px ;width: 900px; border: 1px solid #000000;"></textarea></p>
                <!--<p><input id="uploadtext"  name="uploadtext" placeholder="在这里输入想要投稿的内容哦~" type="text" style=" word-wrap:break-word; word-break:break-all; height:1000px ;width: 700px;border: 1px solid #000000;"></p>
                -->
                <p>
                    <input id="submit" type="submit" value="就这样！" style="height:35px;width: 200px;margin-left: 10%;border-radius: 5px;background: none;border: 1px solid black"
                          onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
                </p>
            </form>
        <form action="Servlet/HomePageServlet" method="post">
            <!--in there i changed the action from servlet/myservlet and metthod from get -->
            <p>
                <input id="tohome" type="submit" value="回主页" style="height: 35px;width: 200px;margin-left:10%;border-radius: 5px;background:none;z-index:2;;border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
            </p>
        </form>
    </div>
    </div>
</div>
</body>
</html>
