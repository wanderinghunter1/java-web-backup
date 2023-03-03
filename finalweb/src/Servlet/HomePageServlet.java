package Servlet;

import jdbc_demo.homepageinfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import jdbc_demo.login;
import jdbc_demo.searchtext;
import usedclass.*;

@WebServlet(name = "MyServlet")
public class HomePageServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //encoding control
        req.getSession().setAttribute("pass","1");
        System.out.println("JUMP!");
        mixhomepage01 outmix1 = homepageinfo.gethomepage("1");
        mixhomepage01 outmix2 = homepageinfo.gethomepage("2");
//        mixhomepage01 outmix3 = homepageinfo.gethomepage("3");
        mixhomepage01 outmix3 = homepageinfo.getalltext();

        int sum1=outmix1.list.size();
        int sum2=outmix2.list.size();
        int sum3=outmix3.list.size();
        int sum11=outmix1.list.size();
        int sum22=outmix2.list.size();
        int sum33=outmix3.list.size();

        System.out.println("sum1: "+sum1+"sum2: "+sum2+"sum3: "+sum3);

        for(int i=0;i<sum1;i++) {
            //System.out.println(outmix1.out[i].textid);

            req.getSession().setAttribute("textid1"+i,outmix1.list.get(i).textid);
            text give = searchtext.searchtext(outmix1.list.get(i).textid);
            //System.out.println("give "+give.title+"  "+give.inner);
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
            req.getSession().setAttribute("inner01" + i, give.inner);
            req.getSession().setAttribute("title01" + i, give.title);
        }

        for(int i=0;i<sum2;i++) {

            req.getSession().setAttribute("textid2"+i,outmix2.list.get(i).textid);
            //System.out.println(outmix1.out[i].textid);
            text give = searchtext.searchtext(outmix2.list.get(i).textid);
            //System.out.println("give "+give.title+"  "+give.inner);
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
            req.getSession().setAttribute("inner02" + i, give.inner);
            req.getSession().setAttribute("title02" + i, give.title);
        }

        for(int i=0;i<sum3;i++) {
            req.getSession().setAttribute("textid3"+i,outmix3.list.get(i).textid);
            System.out.println("textid3------------------->"+outmix3.list.get(i).textid);
            text give = searchtext.searchtext(outmix3.list.get(i).textid);
            //System.out.println("give "+give.title+"  "+give.inner);
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
            req.getSession().setAttribute("inner03" + i, give.inner);
            req.getSession().setAttribute("title03" + i, give.title);
        }
        req.getSession().setAttribute("sum1" , sum11);
        req.getSession().setAttribute("sum2" , sum22);
        req.getSession().setAttribute("sum3" , sum33);
        resp.sendRedirect("http://localhost:8080/testweb/homepage.jsp");
        //<%=session.getAttribute("inner011")%>
    }
}
