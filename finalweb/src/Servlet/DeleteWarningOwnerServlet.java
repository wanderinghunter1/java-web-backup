package Servlet;

import jdbc_demo.delete;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyServlet")
public class DeleteWarningOwnerServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //encoding control
        String userid=req.getParameter("deletewarningownerid");
        delete.deleteownertext(userid);
        delete.delete(userid);

        System.out.println("delete textid"+userid);

        resp.sendRedirect("ShowWarningServlet");
    }
}
