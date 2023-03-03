package Servlet;

import jdbc_demo.insert;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyServlet")
public class InsertServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding ("utf-8");
        //encoding control
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        String pwd2 = req.getParameter("pwd2");
        String webname = req.getParameter("webname");
        String email = req.getParameter("email");
        //System.out.println(uname+":"+pwd);
        if((pwd.equals(pwd2))&&(insert.insert(uname,pwd,webname,email)==1))
        {
            System.out.println("Success load");
            //
            req.getSession().setAttribute("uname",uname);
            //
            resp.getWriter().write("<script>alert('注册成功！');window.location='http://localhost:8080/testweb/loginpage.jsp';</script>");
        }
        else {
            System.out.println("filed");
            String attention="failed test";
            req.getSession().setAttribute("attention",attention);
            resp.getWriter().write("<script>alert('注册失败！');window.location='http://localhost:8080/testweb/insert.jsp';</script>");
        }
    }
}
