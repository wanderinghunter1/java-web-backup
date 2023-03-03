package Servlet;

import jdbc_demo.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyServlet")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //encoding control
        req.getSession().setAttribute("webname",null);
        req.getSession().setAttribute("userid",null);
        req.getSession().setAttribute("usersuper",null);
        //System.out.println(uname+":"+pwd);
        resp.getWriter().write("<script>alert('登出成功！');window.location='HomePageServlet';</script>");

    }
}
