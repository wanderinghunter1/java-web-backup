package Servlet;

import jdbc_demo.homepageinfo;
import jdbc_demo.searchtext;
import jdbc_demo.userspaceinfo;
import usedclass.mixcommit;
import usedclass.text;
import usedclass.textid;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyServlet")
public class UserSpaceServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //encoding control
        String userid = (String) req.getSession().getAttribute("userid");

        if(userid==null)
        {
            resp.getWriter().write("<script>alert('未登录！先登录吧~');window.location='http://localhost:8080/testweb/loginpage.jsp';</script>");
        }

        textid outmix = userspaceinfo.getusertext(userid);

        int usertextsum=outmix.list.size();

        req.getSession().setAttribute("usertextsum" , usertextsum);

        for(int i=0;i<usertextsum;i++) {
            //System.out.println(outmix1.out[i].textid);
            //req.getSession().setAttribute("usertext"+i,outmix.list.get(i));
            text give = searchtext.searchtext(outmix.list.get(i));
            String title=give.title;
            String inner=give.inner;
            if(title!=null&&inner!=null) {
                if (title.length() > 80) {
                    System.out.println("titlelength " + title.length());
                    title = homepageinfo.cutString(title, 80);
                    give.title = title;
                    give.title += "...";
                }
                if (inner.length() > 150) {

                    System.out.println("innerlength " + inner.length());
                    inner = homepageinfo.cutString(inner, 150);
                    give.inner = inner;
                    give.inner += "...";
                }
            }
            req.getSession().setAttribute("usertextinner" + i, give.inner);
            req.getSession().setAttribute("usertexttitle" + i, give.title);
            req.getSession().setAttribute("usertextid" + i, outmix.list.get(i));
        }

        textid likemix = userspaceinfo.getuserlike(userid);

        int userlikesum=likemix.list.size();

        req.getSession().setAttribute("userlikesum" , userlikesum);

        for(int i=0;i<userlikesum;i++) {
            //System.out.println(outmix1.out[i].textid);
            //req.getSession().setAttribute("usertext"+i,outmix.list.get(i));
            text give = searchtext.searchtext(likemix.list.get(i));
            String title=give.title;
            String inner=give.inner;
            if(title!=null&&inner!=null) {
                if (title.length() > 80) {
                    System.out.println("titlelength " + title.length());
                    title = homepageinfo.cutString(title, 80);
                    give.title = title;
                    give.title += "...";
                }
                if (inner.length() > 150) {

                    System.out.println("innerlength " + inner.length());
                    inner = homepageinfo.cutString(inner, 150);
                    give.inner = inner;
                    give.inner += "...";
                }
            }
            req.getSession().setAttribute("userlikeinner" + i, give.inner);
            req.getSession().setAttribute("userliketitle" + i, give.title);
            req.getSession().setAttribute("userlikeid" + i, likemix.list.get(i));
        }


        mixcommit mixcommit= jdbc_demo.like.getusercommit(userid);

        req.getSession().setAttribute("usercommitsum", mixcommit.textcommit.size());

        for(int i=0;i<mixcommit.textcommit.size();i++)
        {
            req.getSession().setAttribute("usercommitid"+i,mixcommit.textcommit.get(i).commitid);
            req.getSession().setAttribute("usercommitinner"+i, mixcommit.textcommit.get(i).inner);
            req.getSession().setAttribute("usercommittextid"+i, mixcommit.textcommit.get(i).textid);
            req.getSession().setAttribute("usercommituserid"+i, mixcommit.textcommit.get(i).userid);
        }

        resp.sendRedirect("http://localhost:8080/testweb/userspacepage.jsp");
    }
}
