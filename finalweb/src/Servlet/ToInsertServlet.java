package Servlet;

import jdbc_demo.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyServlet")
public class ToInsertServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //encoding control
        resp.getWriter().write("<script>alert('感谢您的喜欢，欢迎注册！');window.location='http://localhost:8080/testweb/insert.jsp';</script>");
    }
}
