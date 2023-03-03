<%--
  Created by IntelliJ IDEA.
  User: dell123
  Date: 2021/9/17
  Time: 23:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html><head>
  <title>背景附着属性 background-attachment</title>
  <style type="text/css">
    body {background-image:url(../BG/01.jpg); background-repeat:no-repeat; background-attachment:fixed} </style>
</head>
<body>
<p>这个HTML使用了CSS的background-attachment属性，将背景图片固定，不随内容滚动而滚动。<p>
<p>背景附着(background-attachment)属性有两个值。一个是scroll，表示随内容滚动而动；一个是fixed，表示固定不动，不受内容滚动影响。缺省值是scroll。</p>
<p>background-attachment要和background-image一起用。</p>
</body></html>
