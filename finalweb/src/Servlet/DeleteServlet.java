package Servlet;

import jdbc_demo.delete;
import jdbc_demo.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyServlet")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //encoding control
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        String pwd2 = req.getParameter("pwd2");
        //System.out.println(uname+":"+pwd);
        if((pwd.equals(pwd2))&&(login.compare(uname,pwd)==1)&&(delete.delete(uname)==1))
        {
            System.out.println("Success load");
            //
            req.getSession().setAttribute("uname",uname);
            //
            resp.getWriter().write("<script>alert('delect成功！');window.location='http://localhost:8080/testweb/index.jsp';</script>");
        }
        else {
            System.out.println("delete failed");
            String attention="failed test";
            req.getSession().setAttribute("attention",attention);
            resp.getWriter().write("<script>alert('delete失败！');window.location='http://localhost:8080/testweb/delete.jsp';</script>");
        }
    }
}
