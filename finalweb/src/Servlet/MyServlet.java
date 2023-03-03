package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import jdbc_demo.login;

@WebServlet(name = "MyServlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //encoding control
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        System.out.println(uname+":"+pwd);
        if(login.compare(uname,pwd)==1)
        {
            System.out.println("Success");
            //
            req.getSession().setAttribute("uname",uname);
            //
            resp.getWriter().write("<script>alert('登录成功！');window.location='http://localhost:8080/testweb/index.jsp';</script>");
        }
        else {
            System.out.println("filed");
            String attention="failed test";
            req.getSession().setAttribute("attention",attention);
            resp.getWriter().write("<script>alert('登录失败！');window.location='http://localhost:8080/testweb/mainpage.jsp';</script>");
        }


    }
}
