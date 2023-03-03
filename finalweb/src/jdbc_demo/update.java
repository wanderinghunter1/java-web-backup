package jdbc_demo;

import java.sql.*;

public class update {


    public static int  updateemail (String account, String email)
    {
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
        int state = 0;
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/webtest?serverTimezone=UTC","root","123321");
            //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("select * from user ");
            //user 为你表的名称
            while (rs.next()) {
                if(account.equals(rs.getString("userid"))){
                    state=1;
                }
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        if(state!=1)
        {
            return 0;
        }
        state=0;


        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/webtest?serverTimezone=UTC","root","123321");
            //PreparedStatement stmt=null;
            ResultSet rs=null;
            String sql="update user set email = ? where userid = ?";
            PreparedStatement stmt=connect.prepareStatement(sql);


            stmt.setObject(1,email);
            stmt.setObject(2,account);
            //stmt.setObject(2,password);
            //stmt.setObject(3,webname);
            //stmt.setObject(5,null);

            state=stmt.executeUpdate();
            System.out.print("update!");
        }
        catch (Exception e) {
            System.out.print("insert data error!");
            e.printStackTrace();
        }
        return state;
    }






    public static int  updatepassword (String account, String password)
    {
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
        int state = 0;
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/webtest?serverTimezone=UTC","root","123321");
            //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("select * from user ");
            //user 为你表的名称
            while (rs.next()) {
                if(account.equals(rs.getString("userid"))){
                    state=1;
                }
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        if(state!=1)
        {
            return 0;
        }
        state=0;


        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/webtest?serverTimezone=UTC","root","123321");
            //PreparedStatement stmt=null;
            ResultSet rs=null;
            String sql="update user set password = ? where userid = ?";
            PreparedStatement stmt=connect.prepareStatement(sql);

            stmt.setObject(1,password);
            stmt.setObject(2,account);

            //stmt.setObject(3,webname);
            //stmt.setObject(1,email);
            //stmt.setObject(5,null);

            state=stmt.executeUpdate();
            System.out.print("insert!");
        }
        catch (Exception e) {
            System.out.print("insert data error!");
            e.printStackTrace();
        }

        return state;
    }




    public static int  updatewebname (String account, String webname)
    {
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
        int state = 0;
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/webtest?serverTimezone=UTC","root","123321");
            //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("select * from user ");
            //user 为你表的名称
            while (rs.next()) {
                if(account.equals(rs.getString("userid"))){
                    state=1;
                }
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        if(state!=1)
        {
            return 0;
        }
        state=0;

        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/webtest?serverTimezone=UTC","root","123321");
            //PreparedStatement stmt=null;
            ResultSet rs=null;
            String sql="update user set webname = ? where userid = ?";
            PreparedStatement stmt=connect.prepareStatement(sql);

            stmt.setObject(1,webname);
            stmt.setObject(2,account);
            //stmt.setObject(2,password);
            //stmt.setObject(1,password);
            //stmt.setObject(4,email);
            //stmt.setObject(5,null);

            state=stmt.executeUpdate();
            System.out.print("insert!");
        }
        catch (Exception e) {
            System.out.print("insert data error!");
            e.printStackTrace();
        }
        return state;
    }


}