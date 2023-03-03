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
    <title>textpage</title>
</head>
<style type="text/css">
    a:LINK {
        color: blue;
        text-decoration: none;
    }

    a:VISITED {
        color: royalblue;
        text-decoration: none;
    }

    a:HOVER {
        background-color: whitesmoke;
        text-decoration: none;
    }
    a:active {
        color: coral; /*鼠标按下的颜色变化*/
    }
    #div{
        width:400px;
        height:300px;
        border:1px solid #888484;
    }
    .div1{
        width:150px;
        height:150px;
        background-color:red;
        float:left;        /*向左浮动:对父类div为对象*/
    }
    .div2{
        width:150px;
        height:150px;
        background-color:yellow;
        float:right;  /*向右浮动：:对父类div为对象*/
    }
    #span1{
        width:100px;
        height:80px;
        background-color: rgb(0, 60, 255);
        position:absolute;    /**绝对定位**/
        margin-top:25px;    /**对于屏幕边进行定位**/
        margin-left:30px;
    }
    #span2{
        width:100px;
        height:80px;
        background-color: rgba(0, 60, 255, 0);
        position:absolute;    /**绝对定位**/
        margin-top:25px;    /**对于屏幕边进行定位**/
        margin-left:950px;
    }

    #span3 {
        width: 100px;
        height: 80px;
        background-color: rgba(0, 60, 255, 0);
        position: absolute; /**绝对定位**/
        margin-top: 25px; /**对于屏幕边进行定位**/
        margin-left: 450px;
    }
    #span4 {
        width: 100px;
        height: 80px;
        background-color: rgba(0, 60, 255, 0);
        position: absolute; /**绝对定位**/
        margin-top: 25px; /**对于屏幕边进行定位**/
        margin-left: 1250px;
    }
    #span5 {
        width: 100px;
        height: 80px;
        background-color: rgba(18, 45, 129, 0);
        position: absolute; /**绝对定位**/
        margin-top: 75px; /**对于屏幕边进行定位**/
        margin-left: 1250px;
    }
    #span6 {
        width: 100px;
        height: 80px;
        background-color: rgba(129, 18, 120, 0);
        position: absolute; /**绝对定位**/
        margin-top: 25px; /**对于屏幕边进行定位**/
        margin-left: 700px;
    }
    #span7 {
        width: 100px;
        height: 80px;
        background-color: rgba(129, 18, 120, 0);
        position: absolute; /**绝对定位**/
        margin-top: 25px; /**对于屏幕边进行定位**/
        margin-left: 950px;
    }
</style>
<body id="body">
<%
    //String textid=(String) session.getAttribute("textid");
    //String userid=(String) session.getAttribute("userid");
    int sumlike = (int) session.getAttribute("like");
%>
<div style="z-index: 1;position: fixed;left: 1px;top: 1px"><img src="BG/AAB34CD2AE751DC47E3DCF2301BD01CF.jpg" style="width: 100%;height: 100%;"><img/></div>
<div style="width: 100%;z-index:2;height: auto ;position: relative;">
    <div>
        <div id="span3">
        <form action="Servlet/HomePageServlet" method="post">
            <!--in there i changed the action from servlet/myservlet and metthod from get -->
            <p>
                <input id="tohome" type="submit" value="回主页" style="height: 35px;width: 200px;border-radius: 5px;background: rgba(225,225,225,0.5);border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
            </p>
        </form>
        </div>
        <div id="span4">
            <%
                out.println("喜欢的人数： "+sumlike);
            %>
        </div>
        <div id="span5">
        <form action="Servlet/LikeServlet" method="post">
            <!--in there i changed the action from servlet/myservlet and metthod from get -->
                <input id="submitlike" type="submit" value="<%if((session.getAttribute("userid")!=null)&&(int)session.getAttribute("iflike")==1)
                {
                    out.println("不喜欢了！");
                }
                else
                {
                    out.println("喜欢！");
                }%>" style="height: 35px;width: 200px;border-radius: 5px;background:rgba(225,225,225,0.5);;border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
        </form>
        </div>
        <div id="span6">
        <form action="uploadpage.jsp" method="post">
            <p>
                <input id="upload" type="submit" value="我要投稿！" style="height: 35px;width: 200px;margin-left:30%;border-radius: 5px;background: rgba(225,225,225,0.5);;border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
            </p>
        </form>
        </div>
        <div id="span7">
        <form action="Servlet/WarningServlet" method="post">
            <p>
                <input id="warning" type="submit" value="举报！" style="height: 35px;width: 200px;margin-left:30%;border-radius: 5px;background: rgba(225,225,225,0.5);;border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
            </p>
        </form>
        </div>
    </div>
</div>
<br>
<%
    int submit1=0;
%>
<div  style="width: 100%;height: auto ">
    <!--<div style="z-index: 1;position: absolute;left: 1px;top: 1px"><img src="BG/01.jpg" style="width: 100%;height: 50%;"><img/></div>-->
        <div style="background:rgba(225,225,225,0.5);width: 1000px;height: auto; border: 1px solid #000000;margin:0 auto;margin-top: 10% ;z-index: 10;position: relative;border-radius: 10px">
        <h2 style="color: #000000;margin-left: 45%;margin-top: 10px">文章内容</h2>
            <div style="margin: 0 auto;">
                <div style="margin-left: auto">
                <h1>
                    <tb style="word-wrap: break-word;word-break: break-all;">
                    <%
                        String test= (String) session.getAttribute("title");
                        out.println(test);
                    %>
                    </tb>
                </h1>
                </div>
                <br>
                <div>
                <h3>
                    <tb style="word-wrap: break-word;word-break: break-all;">
                        <%
                            String test1= (String) session.getAttribute("inner");
                            out.println(test1);
                        %>
                    </tb>
                </h3>
                </div>
            </div>
        </div>
</div>
<br>
<div style="width: 100%;height: auto ">
    <!--<div style="z-index: 1;position: absolute;left: 1px;top: 1px"><img src="BG/01.jpg" style="width: 100%;height: 50%;"><img/></div>-->
    <div style="background:rgba(225,225,225,0.5);width: 1000px;height: auto; border: 1px solid #000000;margin:0 auto;margin-top: 10% ;z-index: 10;position: relative;border-radius: 10px">
        <h2 style="color: #000000;margin-left:45%;margin-top: 10px">发表评论</h2>
        <div style="margin: 0 auto;">
            <div>
                    <form action="Servlet/CommitServlet" method="post">
                        <!--in there i changed the action from servlet/myservlet and metthod from get -->
                        <p><textarea rows="20" cols="5" name="newcommit" placeholder="说点什么叭~" type="text" style="
                        width:900px ;height: 170px;margin-left:40px;border: 1px solid #000000;"></textarea></p>
                        <p>
                            <input id="submit" type="submit" value="发表" style="height: 35px;width: 200px;margin-left:70%;border-radius: 5px;background: none;border: 1px solid black"
                                   onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
                        </p>
                    </form>
            </div>
        </div>
    </div>
</div>
<%
    int sum = (int) session.getAttribute("commitrange");
    for(int i=0;i<sum;i++)
    {
%>
<div style="width: 100%;height: auto ">
    <div style="background:rgba(225,225,225,0.5);width: 1000px;height: auto; border: 1px solid #000000;margin:0 auto;margin-top: 10% ;z-index: 10;position: relative;border-radius: 10px">
        <h2 style="color: #000000;margin-left: 45%;margin-top: 10px">评论</h2>
        <div style="margin: 0 auto;">
            <div>
                <h4>
                    <tb style="word-wrap: break-word;word-break: break-all;">
                        <h2>
                        <%
                            String name=(String) session.getAttribute("username"+i);
                            out.println(name+"  ");
                            out.println("说");
                        %>
                        </h2>
                        <h5>
                        <%
                            String inner=(String) session.getAttribute("inner"+i);
                            out.println(inner);
                        %>
                        </h5>
                    </tb>
                </h4>
            </div>
        </div>
    </div>
</div>
<%
    }
%>
</body>
</html>
