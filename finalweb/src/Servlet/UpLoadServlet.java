package Servlet;

import jdbc_demo.login;
import jdbc_demo.upload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyServlet")
public class UpLoadServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding ("utf-8");
        //req.setCharacterEncoding("gb2312");
        //encoding control
        String zoneid=(String) req.getParameter("selectzoneid");resp.setCharacterEncoding("utf-8");
        String loadtext = req.getParameter("uploadtext");resp.setCharacterEncoding("utf-8");


        loadtext=loadtext.replace("\n","<br>");
        String textid= upload.getmax();
        //String innerid = upload.getnormalmax();
        String name=req.getParameter("uploadtitle");
        //System.out.println("----------------------------------->"+loadtext);
        if(name==null||loadtext==null)
        {
            resp.sendRedirect("HomePageServlet");
        }
        String userid=(String) req.getSession().getAttribute("userid");

        upload.insert(userid,textid,loadtext,name,zoneid);

        //upload.insertintonormal("3",innerid,textid);

        resp.sendRedirect("HomePageServlet");
    }
}
