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
    #spanspecial{
        width:100px;
        height:80px;
        background-color: rgba(0, 60, 255, 0);
        position:absolute;    /**绝对定位**/
        margin-top:200px;    /**对于屏幕边进行定位**/
        margin-left:240px;
    }
    #span3{
        width:100px;
        height:80px;
        background-color: rgba(0, 60, 255, 0);
        position:absolute;    /**绝对定位**/
        margin-top:25px;    /**对于屏幕边进行定位**/
        margin-left:30px;
    }
    #span4{
        width:100px;
        height:80px;
        background-color: rgba(0, 60, 255, 0);
        position:absolute;    /**绝对定位**/
        margin-top:25px;    /**对于屏幕边进行定位**/
        margin-left:260px;
    }
    #span5{
        width:100px;
        height:80px;
        background-color: rgba(0, 60, 255, 0);
        position:absolute;    /**绝对定位**/
        margin-top:25px;    /**对于屏幕边进行定位**/
        margin-left:490px;
    }
    #span6{
        width:100px;
        height:80px;
        background-color: rgba(0, 60, 255, 0);
        position:absolute;    /**绝对定位**/
        margin-top:25px;    /**对于屏幕边进行定位**/
        margin-left:720px;
    }








    #span7{
        width:100px;
        height:80px;
        background-color: rgba(0, 60, 255, 0);
        position:absolute;    /**绝对定位**/
        margin-top:75px;    /**对于屏幕边进行定位**/
        margin-left:30px;
    }
    #span8{
        width:100px;
        height:80px;
        background-color: rgba(0, 60, 255, 0);
        position:absolute;    /**绝对定位**/
        margin-top:75px;    /**对于屏幕边进行定位**/
        margin-left:260px;
    }
    #span9{
        width:100px;
        height:80px;
        background-color: rgba(255, 255, 255, 0);
        position:absolute;    /**绝对定位**/
        margin-top:75px;    /**对于屏幕边进行定位**/
        margin-left:490px;
    }
    #span10{
        width:100px;
        height:80px;
        background-color: rgba(255, 255, 255, 0);
        position:absolute;    /**绝对定位**/
        margin-top:75px;    /**对于屏幕边进行定位**/
        margin-left:720px;
    }


    #span11{
        width:100px;
        height:80px;
        background-color: rgba(255, 89, 89, 0);
        position:absolute;    /**绝对定位**/
        margin-top:45px;    /**对于屏幕边进行定位**/
        margin-left:425px;
    }

    #span12{
        width:100px;
        height:80px;
        background-color: rgba(89, 255, 142, 0);
        position:absolute;    /**绝对定位**/
        margin-top:750px;    /**对于屏幕边进行定位**/
        margin-left:425px;
    }

    #span13{
        width:400px;
        height:80px;
        background-color: rgba(89, 255, 142, 0);
        position:absolute;    /**绝对定位**/
        margin-top:90px;    /**对于屏幕边进行定位**/
        margin-left:0px;
    }


</style>
<body id="body">
<div style="z-index: 1;position: fixed;left: 1px;top: 1px"><img src="BG/696F3A048B13505A56F8ACB7930EA2F5.jpg" style="width: 100%;height: 100%;"><img/></div>

<%
    int sum= (int) session.getAttribute("sum");
%>
<%
    String webname= (String)session.getAttribute("webname");
    String userid=(String)session.getAttribute("userid");
    String usersuper=(String) session.getAttribute("usersuper");
    out.println();
%>
<!--<div style="z-index: 1;position: absolute;left: 1px;top: 1px"><img src="BG/01.jpg" style="width: 100%;height: 50%;"><img/></div>-->
<div style="background-color:rgba(225,225,225,0.5);width:70%;height: 17%; border: 1px solid #000000;margin:0 auto;margin-top: 0.5% ;z-index: 10;position: relative;border-radius: 10px">
    <!--<h2 style="color: #000000;margin-left: 45%;margin-top: 10px">今日热点</h2>-->
    <div id="spanspecial" >
        <form action="Servlet/HomePageServlet" method="post">
            <!--in there i changed the action from servlet/myservlet and metthod from get -->
            <p>
                <input id="tohome" type="submit" value="回主页" style="background-color:rgba(225,225,225,0.5);height: 35px;width: 800px;margin-left:27%;border-radius: 5px;background: none;border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
            </p>
        </form>
    </div>
    <div id="span2">
        <%
            if(webname==null&&userid==null)
            {
        %>

        <form action="loginpage.jsp" method="post" >
            <p>
                <input id="submit" type="submit" value="登陆" style="height: 35px;width: 80px;margin-left:85%;margin-top: 0.5%;border-radius: 5px;background: none;border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
            </p>
        </form>
        <form action="insert.jsp" method="post" >
            <p>
                <input id="submit2" type="submit" value="注册" style="height: 35px;width: 80px;margin-left: 85%;margin-top: 1%;border-radius: 5px;background: none;border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
            </p>
        </form>


        <%} else
        {
            //webname.substring(0,10);
        %>
        <form action="Servlet/UserSpaceServlet" method="post">
                <%if(webname!=null){%>
            <p>
                <input id="submit3" type="submit" value="<%out.println("欢迎您！ "+webname);%>" style="height: 35px;width: 200px;margin-left:80%;margin-top:0.5%;border-radius: 5px;background: none;border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
            </p>
                <%}else{%>
            <p>
                <input id="submit4" type="submit" value="<%out.println("欢迎您！ "+userid);%>" style="height: 35px;width:200px;margin-left:80%;margin-top:1%;border-radius: 5px;background: none;border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
            </p>

                <%}%>
            <form action="uploadpage.jsp" method="post">
                <p>
                    <input id="submittext" type="button" value="我要投稿！" onclick=location.href="uploadpage.jsp" style="height: 35px;width: 200px;margin-left:80%;margin-top:1%;border-radius: 5px;background: none;border: 1px solid black"
                           onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
                </p>
            </form>
                <%
                }
                %>
    </div>
    <div id="span3">
        <form action="ZonePageServlet" method="post">
            <p>
                <input id="zone3" type="button" value="竞技体育"  onclick=location.href="Servlet/ZonePageServlet?zoneid=3" style="height: 35px;width: 200px;;border-radius: 5px;background: none;border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 3">
            </p>
        </form>
    </div>
    <div id="span4">
        <form action="ZonePageServlet" method="post">
            <p>
                <input id="zone4" type="button" value="人文历史"  onclick=location.href="Servlet/ZonePageServlet?zoneid=4" style="height: 35px;width: 200px;border-radius: 5px;background: none;border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 3">
            </p>
        </form>
    </div>
    <div id="span5">
        <form action="ZonePageServlet" method="post">
            <p>
                <input id="zone5" type="button" value="旅游自然"  onclick=location.href="Servlet/ZonePageServlet?zoneid=5" style="height: 35px;width: 200px;border-radius: 5px;background: none;border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 3">
            </p>
        </form>
    </div>
    <div id="span6">
        <form action="ZonePageServlet" method="post">
            <p>
                <input id="zone6" type="button" value="影音世界"  onclick=location.href="Servlet/ZonePageServlet?zoneid=6" style="height: 35px;width: 200px;border-radius: 5px;background: none;border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 3">
            </p>
        </form>
    </div>
    <div id="span7">
        <form action="ZonePageServlet" method="post">
            <p>
                <input id="zone7" type="button" value="娱乐音乐"  onclick=location.href="Servlet/ZonePageServlet?zoneid=7" style="height: 35px;width: 200px;border-radius: 5px;background: none;border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 3">
            </p>
        </form>
    </div>
    <div id="span8">
        <form action="ZonePageServlet" method="post">
            <p>
                <input id="zone8" type="button" value="情感天地"  onclick=location.href="Servlet/ZonePageServlet?zoneid=8" style="height: 35px;width: 200px;border-radius: 5px;background: none;border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 3">
            </p>
        </form>
    </div>
    <div id="span9">
        <form action="ZonePageServlet" method="post">
            <p>
                <input id="zone9" type="button" value="生活琐碎"  onclick=location.href="Servlet/ZonePageServlet?zoneid=9" style="height: 35px;width: 200px;border-radius: 5px;background: none;border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 3">
            </p>
        </form>
    </div>
    <div id="span10">
        <form action="ZonePageServlet" method="post">
            <p>
                <input id="zone10" type="button" value="时事新闻"  onclick=location.href="Servlet/ZonePageServlet?zoneid=10" style="height: 35px;width: 200px;border-radius: 5px;background: none;border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 3">
            </p>
        </form>
    </div>
</div>
<!--<div style="margin-top: 10%;margin-left: 18%">
</div>-->


<div style="margin-top: 0.5%;">
    <!--<div style="z-index: 1;position: absolute;left: 1px;top: 1px"><img src="BG/01.jpg" style="width: 100%;height: 50%;"><img/></div>-->
    <div style="background-color:rgba(225,225,225,0.5);width: 1000px;height: auto; border: 1px solid #000000;margin:0 auto;margin-top: 10% ;z-index: 10;position: relative;border-radius: 10px">
        <h2 style="color: #000000;margin-left: 45%;margin-top: 10px">本分区文章</h2>
        <%  for(int i=0;i<sum;i++)
        {
            String textid=(String) session.getAttribute("zonetextid"+i);
        %>
        <div style="margin: 0 auto;">
            <tb style="word-wrap: break-word;word-break: break-all;">
                    <%
                        String test1= (String) session.getAttribute("zonetitle"+i);
                        //out.println(test);
                        String test2= (String) session.getAttribute("zoneinner"+i);
                        //out.println(test);
                        //test2.substring(0,100);
                    %>
                <div>
                    <h2>
                        <a href="Servlet/ToTextServlet?id=<%=textid%>"><%out.println(test1);%></a>
                    </h2>
                    <h4>
                        <a href="Servlet/ToTextServlet?id=<%=textid%>"><%out.println(test2);%></a>
                    </h4>
                </div>
                        <br>
        <%
            }
        %>
    </div>
</div>
</div>
</body>
</html>
