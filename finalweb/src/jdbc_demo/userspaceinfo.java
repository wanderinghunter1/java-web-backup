package jdbc_demo;

import usedclass.textid;
import java.sql.*;

public class userspaceinfo {

    public static textid getusertext(String id) {
        textid outmix = new textid();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");     //加载MYSQL JDBC驱动程序
            //Class.forName("org.gjt.mm.mysql.Driver");
            System.out.println("Success loading gethomepage Mysql Driver!");
        } catch (Exception e) {
            System.out.print("Error loading Mysql Driver!");
            e.printStackTrace();
        }
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/webtest?serverTimezone=UTC", "root", "123321");
            //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码
            System.out.println("Success connect gethomepage2 Mysql server!");
            Statement stmt = connect.createStatement();
            try (ResultSet rs = stmt.executeQuery("select * from text")) {
                //user 为你表的名称
                //System.out.println("finding");
                while (rs.next()) {
                    if ((id.equals(rs.getString("userid")))) {
                        outmix.list.add(rs.getString("textid"));
                    }
                }
            }
        } catch (Exception e) {
            System.out.print("get data error!");
            e.printStackTrace();
        }
        return outmix;
    }

    public static textid getuserlike(String id) {
        textid outmix = new textid();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");     //加载MYSQL JDBC驱动程序
            //Class.forName("org.gjt.mm.mysql.Driver");
            System.out.println("Success loading gethomepage Mysql Driver!");
        } catch (Exception e) {
            System.out.print("Error loading Mysql Driver!");
            e.printStackTrace();
        }
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/webtest?serverTimezone=UTC", "root", "123321");
            //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码
            System.out.println("Success connect gethomepage2 Mysql server!");
            Statement stmt = connect.createStatement();
            try (ResultSet rs = stmt.executeQuery("select * from ilikeit")) {
                //user 为你表的名称
                System.out.println("finding");
                while (rs.next()) {
                    if ((id.equals(rs.getString("user")))) {
                        outmix.list.add(rs.getString("textid"));
                    }
                }
            }
        } catch (Exception e) {
            System.out.print("get data error!");
            e.printStackTrace();
        }
        return outmix;
    }
}

