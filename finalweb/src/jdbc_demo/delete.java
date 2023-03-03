package jdbc_demo;

import java.sql.*;

public class delete {


    public static int  delete (String account)
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
            String sql="delete from user where userid = ?";
            PreparedStatement stmt=connect.prepareStatement(sql);
            //stmt.setString();

            //System.out.print(account);

            stmt.setObject(1,account);

            int state2=stmt.executeUpdate();
            if(state2>0)
            {
                state=1;
            }
            System.out.print("delete!");
        }
        catch (Exception e) {
            System.out.print("delete data error!");
            e.printStackTrace();
        }
        return state;
    }
    public static int  deletetext (String textid)
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
            String sql="delete from text where textid = ?";
            PreparedStatement stmt=connect.prepareStatement(sql);
            //stmt.setString();

            //System.out.print(account);

            stmt.setObject(1,textid);

            int state2=stmt.executeUpdate();
            if(state2>0)
            {
                state=1;
            }
            warning.deletewarning(textid);
            System.out.print("delete  from text !");
        }
        catch (Exception e) {
            System.out.print("delete data error!");
            e.printStackTrace();
        }
        return state;
    }

    public static int  undeletetext (String textid)
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

            int state2=stmt.executeUpdate();
            if(state2>0)
            {
                state=1;
            }
            warning.deletewarning(textid);
            System.out.print("delete  from text !");
        }
        catch (Exception e) {
            System.out.print("delete data error!");
            e.printStackTrace();
        }
        return state;
    }


    public static void  deleteownertext(String userid)
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
                if(userid.equals(rs.getString("userid"))){
                    deletetext(rs.getString("textid"));
                }
            }
            //System.out.println("out : "+state);
        }
        catch (Exception e) {
            System.out.print("get data error!");
            e.printStackTrace();
        }
        return;
    }

}