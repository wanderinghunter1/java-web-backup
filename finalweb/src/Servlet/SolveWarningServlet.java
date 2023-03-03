package Servlet;

import jdbc_demo.*;
import usedclass.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyServlet")
public class SolveWarningServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //encoding control

        String textid= req.getParameter("deletewarningtextid");
        //String textid=(String) req.getSession().getAttribute("deletewarningtextid");
        System.out.println("delete textid"+textid);
        delete.deletetext(textid);
        //warning.deletewarning(textid);

        resp.sendRedirect("ShowWarningServlet");
    }
}
