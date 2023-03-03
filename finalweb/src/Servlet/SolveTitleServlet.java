package Servlet;

import jdbc_demo.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyServlet")
public class SolveTitleServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //encoding control
        String id=(String) req.getParameter("fristid");
        String innerid=(String) req.getParameter("secondid");
        String textid=(String) req.getParameter("titletextid");
        System.out.println("setting.....text "+id+" "+innerid +" "+ textid);
        if(homepageinfo.sethomepage(id,innerid,textid)==1)
        {
            resp.getWriter().write("<script>alert('设置成功！');window.location='http://localhost:8080/testweb/titlepage.jsp';</script>");
        }
        else {
            resp.getWriter().write("<script>alert('设置失败！');window.location='http://localhost:8080/testweb/titlepage.jsp';</script>");
        }
    }
}
