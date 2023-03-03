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
<!--
<div style="z-index: 1;position: fixed;left: 1px;top: 1px"><img src="BG/696F3A048B13505A56F8ACB7930EA2F5.jpg" style="width: 100%;height: 100%;"><img/></div> -->

<div style="z-index: 1;position: fixed;left: 1px;top: 1px"><img src="BG/696F3A048B13505A56F8ACB7930EA2F5.jpg" style="width: 100%;height: 100%;"><img/></div>
<div>
    <div>
        <form action="Servlet/HomePageServlet" method="post">
            <!--in there i changed the action from servlet/myservlet and metthod from get -->
            <p>
                <input id="tohome" type="submit" value="回主页" style="position: relative;z-index: 3;height: 25px;width: 200px;margin-left:30%;border-radius: 5px;background: rgba(225,225,225,0.5);border: 1px solid black"
                       onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
            </p>
        </form>
    </div>
    <!--<div style="z-index: 1;position: absolute;left: 1px;top: 1px"><img src="BG/01.jpg" style="width: 100%;height: 50%;"><img/></div>-->
<h2 style="z-index:2;position: relative;color: #000000;margin-left: 45%;margin-top: 10px">举报列表</h2>
<%
    int sum=(int)session.getAttribute("warningsum");
    for(int i=0;i<sum;i++)
{
    //String textid=(String) session.getAttribute("warningtextid"+i);
    //session.setAttribute("deletecommitid",i);
%>
<div style="background-color:rgba(225,225,225,0.5);width: 1000px;height: 230px; border: 1px solid #000000;margin:0 auto;margin-top: 10% ;z-index: 10;position: relative;border-radius: 10px">

        <div style="margin: 0 auto;">
            <tb style="word-wrap: break-word;word-break: break-all;">
                <%
                    String test1= (String) session.getAttribute("warningtitle"+i);
                    String textid=(String) session.getAttribute("warningtextid"+i);
                    String userid=(String) session.getAttribute("owner"+i);
                    //out.println(test);
                    //test1.substring(0,100);
                %>

                <div>
                    <h4>
                        <a href="Servlet/ToTextServlet?id=<%=textid%>"><%out.println(test1);%></a>
                    </h4>
                    <div>
                    <p>
                        <%//String commitid=(String) session.getAttribute("usercommitid"+i);%>
                            <input id="submit2" type="submit" value="删除" onclick=location.href="Servlet/SolveWarningServlet?deletewarningtextid=<%=textid%>" style="height: 25px;width: 60px;margin-left:70%;border-radius: 5px;background: none;border: 1px solid black"
                                   onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
                    </p>
                    </div>
                    <div>
                        <p>
                            <%//String commitid=(String) session.getAttribute("usercommitid"+i);%>
                            <input id="submit3" type="submit" value="删除发布者" onclick=location.href="Servlet/DeleteWarningOwnerServlet?deletewarningownerid=<%=userid%>" style="height: 25px;width: 200px;margin-left:70%;border-radius: 5px;background: none;border: 1px solid black"
                                   onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
                        </p>
                    </div>
                    <div>
                        <p>
                            <%//String commitid=(String) session.getAttribute("usercommitid"+i);%>
                            <input id="submit3" type="submit" value="恢复此文章" onclick=location.href="Servlet/UnDeleteServlet?undeleteid=<%=textid%>" style="height: 25px;width: 200px;margin-left:70%;border-radius: 5px;background: none;border: 1px solid black"
                                   onmouseover="this.style.opacity = 0.6" onmouseout="this.style.opacity = 1">
                        </p>
                    </div>
                </div>
            </tb>
        </div>
    </div>
        <%
            }
        %>
</div>
</body>
</html>
