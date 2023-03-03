package Servlet;

import jdbc_demo.login;
import jdbc_demo.update;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyServlet")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding ("utf-8");
        //encoding control
        String uname = (String) req.getSession().getAttribute("userid");
        String pwd = req.getParameter("pwd");
        String pwd2 = req.getParameter("pwd2");
        String webname = req.getParameter("webname");
        String email = req.getParameter("email");
        //System.out.println(uname+":"+pwd);
        if((login.compare(uname,pwd)==1)&&(update.updatepassword(uname,pwd2)>=1)&&(update.updatewebname(uname,webname)>=1)&&(update.updateemail(uname,email)>=1))
        {
            resp.getWriter().write("<script>alert('信息更新成功！');window.location='http://localhost:8080/testweb/loginpage.jsp';</script>");
        }
        else {
            resp.getWriter().write("<script>alert('信息更新失败！');window.location='http://localhost:8080/testweb/update.jsp';</script>");
        }
    }
}
