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
public class ToTextServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //encoding control
        //System.out.println("jump over");
        String textid= req.getParameter("id");//t= (int) req.getSession().getAttribute("submit1");


        System.out.println("receive over " +textid);
        //int submit;
        //submit = Integer.parseInt(a);
        //System.out.println(submit);

        //int id1=submit/10;
        //int id2=submit%10;
        //int sum=(int)req.getSession().getAttribute("sum"+id1);
        //String textid=(String) req.getSession().getAttribute("textid0"+id1+id2);

        int iflike=like.iflike(textid,(String) req.getSession().getAttribute("userid"));
        req.getSession().setAttribute("iflike",iflike);
        req.getSession().setAttribute("nowpagetextid",textid);

        text give=searchtext.searchtext(textid);
        String title = give.title;
        String inner= give.inner;

        //System.out.println(title + " " +inner);
        //mixhomepage01 outmix1 = homepageinfo.gethomepage(""+id1);

        //String textid=outmix1.list.get(id2).textid;

        int like= jdbc_demo.like.getlike(textid);


        req.getSession().setAttribute("inner", inner);
        req.getSession().setAttribute("title", title);
        req.getSession().setAttribute("like", like);
        mixcommit mixcommit= jdbc_demo.like.getcommit(textid);
        req.getSession().setAttribute("commitrange", mixcommit.textcommit.size());

        for(int i=0;i<mixcommit.textcommit.size();i++)
        {
            req.getSession().setAttribute("ccommitid"+i, mixcommit.textcommit.get(i).commitid);
            req.getSession().setAttribute("textid"+i, mixcommit.textcommit.get(i).textid);
            req.getSession().setAttribute("inner"+i, mixcommit.textcommit.get(i).inner);
            req.getSession().setAttribute("userid"+i, mixcommit.textcommit.get(i).userid);
            req.getSession().setAttribute("username"+i, mixcommit.textcommit.get(i).username);
        }

        //req.getSession().setAttribute("sumofcommit", mixcommit.textcommit.length);

        resp.sendRedirect("http://localhost:8080/testweb/textpage.jsp");
    }
}
