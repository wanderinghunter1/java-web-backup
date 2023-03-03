package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import usedclass.text;

public class searchtext {

    public static text  searchtext(String textid)
    {
        text contain=new text();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");     //加载MYSQL JDBC驱动程序
            //Class.forName("org.gjt.mm.mysql.Driver");
            //System.out.println("Success loading Mysql Driver!");
        }
        catch (Exception e) {
            System.out.print("Error loading Mysql Driver!");
            e.printStackTrace();
        }
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/webtest?serverTimezone=UTC","root","123321");
            //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码

            System.out.println("Success1 connect search Mysql server!");
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("select * from text");
            //user 为你表的名称
            while (rs.next()) {
                if(textid.equals(rs.getString("textid")))
                {
                    contain.inner=rs.getString("text");
                    contain.title=rs.getString("name");
                    System.out.println(contain.title);
                    break;
                }
                }
            //System.out.println("out : "+state);
        }
        catch (Exception e) {
            System.out.print("get data error!");
            e.printStackTrace();
        }
        return contain;
    }
    public static String  searchtextowner(String textid)
    {
        String userid = new String();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");     //加载MYSQL JDBC驱动程序
            //Class.forName("org.gjt.mm.mysql.Driver");
            //System.out.println("Success loading Mysql Driver!");
        }
        catch (Exception e) {
            System.out.print("Error loading Mysql Driver!");
            e.printStackTrace();
        }
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/webtest?serverTimezone=UTC","root","123321");
            //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码

            System.out.println("Success1 connect search Mysql server!");
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("select * from text");
            //user 为你表的名称
            while (rs.next()) {
                if(textid.equals(rs.getString("textid")))
                {
                    userid=rs.getString("userid");
                    break;
                }
            }
            //System.out.println("out : "+state);
        }
        catch (Exception e) {
            System.out.print("get data error!");
            e.printStackTrace();
        }
        return userid;
    }


}