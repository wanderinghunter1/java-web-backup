package jdbc_demo;

import java.sql.*;
import usedclass.*;

public class warning {

    public static int  insertwarning (String textid)
    {
        int state = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");     //加载MYSQL JDBC驱动程序
            //Class.forName("org.gjt.mm.mysql.Driver");
            //System.out.println("Success loading Mysql Driver!");
            System.out.println("jdbc open");
        }
        catch (Exception e) {
            System.out.print("Error loading Mysql Driver!");
            e.printStackTrace();
        }

        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/webtest?serverTimezone=UTC","root","123321");
            //PreparedStatement stmt=null;
            ResultSet rs=null;
            String sql="INSERT INTO warning VALUES (?)";
            PreparedStatement stmt=connect.prepareStatement(sql);
            //stmt.setString();

            stmt.setObject(1,textid);

            state=stmt.executeUpdate();
            System.out.print("insert!");
        }
        catch (Exception e) {
            System.out.print("insert data error!");
            e.printStackTrace();
        }
        return state;
    }

    public static textid  selectwarning ()
    {
        //int state = 0;
        textid outmix=new textid();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");     //加载MYSQL JDBC驱动程序
            //Class.forName("org.gjt.mm.mysql.Driver");
            //System.out.println("Success loading Mysql Driver!");
            System.out.println("jdbc open");
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
            ResultSet rs = stmt.executeQuery("select * from warning ");
            //user 为你表的名称
            while (rs.next()) {
                    outmix.list.add(rs.getString("textid"));
            }
            //System.out.println("out : "+state);
        }
        catch (Exception e) {
            System.out.print("insert data error!");
            e.printStackTrace();
        }
        return outmix;
    }

    public static String  gettext(String textid)
    {
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
            ResultSet rs = stmt.executeQuery("select * from text ");
            //user 为你表的名称
            while (rs.next()) {
                if(textid.equals(rs.getString("textid")))
                {
                    return rs.getString("name");
                }
            }
            //System.out.println("out : "+state);
        }
        catch (Exception e) {
            System.out.print("get data error!");
            e.printStackTrace();
        }
        return null;
    }


    public static int  deletewarning (String textid)
    {
        int state = 0;
        System.out.println("in delete");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");     //加载MYSQL JDBC驱动程序
            //Class.forName("org.gjt.mm.mysql.Driver");
            System.out.println("jdbc open in delete");
        }
        catch (Exception e) {
            System.out.print("Error loading Mysql Driver!");
            e.printStackTrace();
        }

        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/webtest?serverTimezone=UTC","root","123321");
            //PreparedStatement stmt=null;
            ResultSet rs=null;
            String sql="delete from warning where textid = ?";
            PreparedStatement stmt=connect.prepareStatement(sql);
            //stmt.setString();

            //System.out.print(account);

            stmt.setObject(1,textid);

            state=stmt.executeUpdate();
            System.out.print("delete form warning list!");
        }
        catch (Exception e) {
            System.out.print("delete data error!");
            e.printStackTrace();
        }
        return state;
    }
}