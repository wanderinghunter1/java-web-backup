package Servlet;

import jdbc_demo.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding ("utf-8");
        //encoding control
        String userid = req.getParameter("userid");
        String pwd = req.getParameter("pwd");
        String webname= login.getwebname(req.getParameter("userid"));
        String usersuper =login.getsuper(userid);
        req.getSession().setAttribute("webname",webname);
        req.getSession().setAttribute("userid",userid);
        req.getSession().setAttribute("usersuper",usersuper);
        //System.out.println(uname+":"+pwd);
        if(login.compare(userid,pwd)==1)
        {
            System.out.println("Success");
            //
            //req.getSession().setAttribute("uname",uname);
            //
            resp.getWriter().write("<script>alert('登录成功！');window.location='HomePageServlet';</script>");
        }
        else {
            //String a="test";
            resp.getWriter().write("<script>alert('登录失败！');window.location='http://localhost:8080/testweb/loginpage.jsp';</script>");
        }


    }
}
