package Servlet;

import jdbc_demo.*;
import usedclass.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyServlet")
public class ShowWarningServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //encoding control
        String usersuperid=(String) req.getSession().getAttribute("usersuper");

        textid idsum=warning.selectwarning();
        int sum=idsum.list.size();
        req.getSession().setAttribute("warningsum",sum);
        for(int i=0;i<sum;i++)
        {
            //System.out.println("deletetextid " + idsum.list.get(i));
            String title=warning.gettext(idsum.list.get(i));
            req.getSession().setAttribute("owner"+i,searchtext.searchtextowner(idsum.list.get(i)));
            req.getSession().setAttribute("warningtextid"+i,idsum.list.get(i));
            req.getSession().setAttribute("warningtitle"+i,title);
        }
        String page1="http://localhost:8080/testweb/warningpage.jsp";
        String page2="UserSpaceServlet";
        String page;
        if(usersuperid.equals("1"))
        {
            page=page1;
        }
        else
        {
            page=page2;
        }
        resp.sendRedirect(page);
    }
}
