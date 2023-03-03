package Servlet;

import jdbc_demo.delete;
import jdbc_demo.insertcommit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyServlet")
public class DeleteTextServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //encoding control
        String deletetextid= req.getParameter("deletetextid");
        if(delete.deletetext(deletetextid)==1)
        {
            //System.out.println("DELETE OVER");
        }

        resp.sendRedirect("UserSpaceServlet");
    }
}
