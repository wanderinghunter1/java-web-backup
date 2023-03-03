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

    #span3{
        width:100px;
        height:80px;
        background-color: rgba(0, 60, 255, 0);
        position:absolute;    /**绝对定位**/
        margin-top:25px;    /**对于屏幕边进行定位**/
        margin-left:20px;
    }
    #span4{
        width:100px;
        height:80px;
        background-color: rgba(0, 60, 255, 0);
        position:absolute;    /**绝对定位**/
        margin-top:25px;    /**对于屏幕边进行定位**/
        margin-left:1080px;
    }
    #span5{
        width:100px;
        height:80px;
        background-color: rgba(0, 60, 255, 0);
        position:absolute;    /**绝对定位**/
        margin-top:25px;    /**对于屏幕边进行定位**/
        margin-left:200px;
    }
    #span6{
        width:100px;
        height:80px;
        background-color: rgba(0, 60, 255, 0);
        position:absolute;    /**绝对定位**/
        margin-top:25px;    /**对于屏幕边进行定位**/
        margin-left:380px;
    }

    #span7{
        width:100px;
        height:80px;
        background-color: rgba(0, 60, 255, 0);
        position:absolute;    /**绝对定位**/
        margin-top:25px;    /**对于屏幕边进行定位**/
        margin-left:560px;
    }
    #span8{
        width:100px;
        height:80px;
        background-color: rgba(0, 60, 255, 0);
        position:absolute;    /**绝对定位**/
        margin-top:25px;    /**对于屏幕边进行定位**/
        margin-left:740px;
    }
</style>
<body id="body">
<div style="z-index: 1;position: fixed;left: 1px;top: 1px"><img src="BG/E8D5FC0AA0B8615FE01B4C2F54ADDE49.jpg" style="width: 100%;height: 100%;"><img/></div>
<%
    String usersuper=(String)session.getAttribute("usersuper");
    System.out.println("usersuper==================="+usersuper);
    int userlikesum=(int)session.getAttribute("userlikesum");
    int usertextsum=(int)session.getAttribute("usertextsum");
    int usercommitsum=(int)session.getAttribute("usercommitsum");
%>
<div style="background-color:rgba(225,225,225,0.5);width:70%;height: 17%; border: 1px solid #000000;margin:0 auto;margin-top: 0.5% ;z-index: 10;position: relative;border-radius: 10px">
    <div id="span3">
    <form action="Servlet/HomePageServlet" method="post">
        <!--in there i changed the action from servlet/myservlet and metthod from get -->
        <p>
            <input id="tohome" type="submit" value="回主页" style="height: 35px;width: 150px;margin-left:30%;border-radius: 5px;background: none;border: 1px solid black"
                   onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
        </p>
    </form>
    </div>
        <div id="span4">
    <form action="Servlet/LogoutServlet" method="post">
        <!--in there i changed the action from servlet/myservlet and metthod from get -->
        <p>
            <input id="logout" type="submit" value="登出" style="height: 35px;width: 150px;margin-left:30%;border-radius: 5px;background: none;border: 1px solid black"
                   onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
        </p>
    </form>
        </div>
            <div id="span5">
    <form action="delete.jsp" method="post">
        <!--in there i changed the action from servlet/myservlet and metthod from get -->
        <p>
            <input id="deleteuserbutton" type="submit" value="注销用户" style="height: 35px;width: 150px;margin-left:30%;border-radius: 5px;background: none;border: 1px solid black"
                   onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
        </p>
    </form>
            </div>
                <div id="span6">
    <form action="update.jsp" method="post">
        <!--in there i changed the action from servlet/myservlet and metthod from get -->
        <p>
            <input id="updateuserbutton" type="submit" value="更新信息" style="height: 35px;width: 150px;margin-left:30%;border-radius: 5px;background: none;border: 1px solid black"
                   onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
        </p>
    </form>
                </div>
    <%if(usersuper.equals("1")){%>
    <div id="span8">
    <form action="Servlet/ShowWarningServlet" method="post">
    <p>
        <input id="warning" type="submit" value="处理举报！" style="height: 35px;width: 150px;margin-left:30%;border-radius: 5px;background: none;border: 1px solid black"
               onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
    </p>
    </form>
    </div>
    <%}%>
    <%if(usersuper.equals("1")||usersuper.equals("2")){%>
    <div id="span7">
    <form action="titlepage.jsp" method="post">
        <!--in there i changed the action from servlet/myservlet and metthod from get -->
        <p>
            <input id="totitlepage" type="submit" value="设置主页" style="height: 35px;width: 150px;margin-left:30%;border-radius: 5px;background: none;border: 1px solid black"
                   onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
        </p>
    </form>
    </div>
    <%}%>
</div>
<br>
<div style="background-color:rgba(225,225,225,0.5);width:1000px;height: 5%; border: 1px solid #000000;margin:0 auto;margin-top: 0.5% ;z-index: 10;position: relative;border-radius: 10px">
<h2 style="color: #000000;margin-left: 45%;margin-top: 10px">我的文章</h2>
</div>
    <!--<div style="z-index: 1;position: absolute;left: 1px;top: 1px"><img src="BG/01.jpg" style="width: 100%;height: 50%;"><img/></div>-->
<div style="z-index:2;position: relative;color: #000000;margin: 0 auto;margin-top: 10px">
<%
    if(usertextsum==0)
    {%>
    <h5 style="color: #000000;margin-left: 47%;margin-top: 10px">什么都没有哦~</h5>
</div>
<%}
    for(int i=0;i<usertextsum;i++) {
    String textid=(String) session.getAttribute("usertextid"+i);
%>
        <div style="background-color:rgba(225,225,225,0.5);width: 1000px;height: 230px; border: 1px solid #000000;margin:0 auto;margin-top: 1% ;z-index: 10;position: relative;border-radius: 10px">

        <div style="margin: 0 auto;">
            <tb style="word-wrap: break-word;word-break: break-all;">
                <%
                    String test1= (String) session.getAttribute("usertexttitle"+i);
                    //out.println(test);
                    String test2= (String) session.getAttribute("usertextinner"+i);
                    //out.println(test);
                    //test2.substring(0,100);
                    //test2.substring(0,100);
                %>
                <div>
                    <p>
                        <input id="deletetext" type="button" value="删除" onclick=location.href="Servlet/DeleteTextServlet?deletetextid=<%=session.getAttribute("usertextid"+i)%>" style="height: 25px;width: 60px;margin-left:70%;border-radius: 5px;background: none;border: 1px solid black"
                               onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
                    </p>
                    <h2>
                        <a href="Servlet/ToTextServlet?id=<%=textid%>"><%out.println(test1);%></a>
                    </h2>
                    <h4>
                        <a href="Servlet/ToTextServlet?id=<%=textid%>"><%out.println(test2);%></a>
                    </h4>
                </div>

            </tb>
        </div>
        </div>
        <%
            }
        %>
            <br>
            <br>
            <br>
            <br>
<br>
<br>
<br>
<br>



            <div style="background-color:rgba(225,225,225,0.5);width:1000px;height: 5%; border: 1px solid #000000;margin:0 auto;margin-top: 0.5% ;z-index: 10;position: relative;border-radius: 10px">
                <h2 style="color: #000000;margin-left: 45%;margin-top: 10px">我的喜欢</h2>
            </div>
            <!--<div style="z-index: 1;position: absolute;left: 1px;top: 1px"><img src="BG/01.jpg" style="width: 100%;height: 50%;"><img/></div>-->
<div style="z-index:2;position: relative;color: #000000;margin: 0 auto;margin-top: 10px">
<%
    if(userlikesum==0)
    {%>

    <h5 style="color: #000000;margin-left: 47%;margin-top: 10px">什么都没有哦~</h5>
</div>
<%  }
    for(int i=0;i<userlikesum;i++)
{
    String textid=(String) session.getAttribute("userlikeid"+i);
%>    <!--<div style="z-index: 1;position: absolute;left: 1px;top: 1px"><img src="BG/01.jpg" style="width: 100%;height: 50%;"><img/></div>-->
    <div style="background-color:rgba(225,225,225,0.5);width: 1000px;height: 230px; border: 1px solid #000000;margin:0 auto;margin-top: 1% ;z-index: 10;position: relative;border-radius: 10px">

        <div style="margin: 0 auto;">
            <tb style="word-wrap: break-word;word-break: break-all;">
                <%
                    String test1= (String) session.getAttribute("userliketitle"+i);
                    //out.println(test);
                    String test2= (String) session.getAttribute("userlikeinner"+i);
                    //out.println(test);
                    //test2.substring(0,100);boolean t1=false;

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

            </tb>
        </div>
    </div>
        <%
            }
        %>
        <br>
        <br>
        <br>
        <br>
<br>
<br>
<br>
<br>
    <!--<div style="z-index: 1;position: absolute;left: 1px;top: 1px"><img src="BG/01.jpg" style="width: 100%;height: 50%;"><img/></div>-->
        <div style="background-color:rgba(225,225,225,0.5);width:1000px;height: 5%; border: 1px solid #000000;margin:0 auto;margin-top: 0.5% ;z-index: 10;position: relative;border-radius: 10px">
            <h2 style="color: #000000;margin-left: 45%;margin-top: 10px">我的评论</h2>
        </div>
        <!--<div style="z-index: 1;position: absolute;left: 1px;top: 1px"><img src="BG/01.jpg" style="width: 100%;height: 50%;"><img/></div>-->
<div style="z-index:2;position: relative;color: #000000;margin-top: 10px">
<%
    if(usercommitsum==0)
    {%>
        <h5 style="color: #000000;margin-left: 47%;margin-top: 10px">什么都没有哦~</h5>
</div>
        <%
        } for(int i=0;i<usercommitsum;i++)
{
    String textid=(String) session.getAttribute("usercommittextid"+i);
    session.setAttribute("deletecommitid",i);
%>
<div style="background-color:rgba(225,225,225,0.5);width: 1000px;height: 230px; border: 1px solid #000000;margin:0 auto;margin-top: 1% ;z-index: 10;position: relative;border-radius: 10px">

        <div style="margin: 0 auto;">
            <tb style="word-wrap: break-word;word-break: break-all;">
                <%
                    String test1= (String) session.getAttribute("usercommitinner"+i);
                    //out.println(test);
                    //test1.substring(0,100);
                %>

                <div>
                    <h4>
                        <a href="Servlet/ToTextServlet?id=<%=textid%>"><%out.println(test1+"...");%></a>
                    </h4>
                    <div>
                    <p>
                        <%String commitid=(String) session.getAttribute("usercommitid"+i);%>
                            <input id="submit2" type="submit" value="删除" onclick=location.href="Servlet/DeleteCommitServlet?deletecommitid=<%=commitid%>" style="height: 25px;width: 60px;margin-left:70%;border-radius: 5px;background: none;border: 1px solid black"
                                   onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
                    </p>
                    </div>
                </div>
            </tb>
        </div>
    </div>
</div>
        <%
            }
        %>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<div style="z-index:2;position: relative;color: #000000;margin-top: 10px">
<h2 style="color: #000000;margin-left: 47%;margin-top: 30px">没有更多了</h2>
</div>
<br>
<br>
<br>
<br>
</body>
</html>
