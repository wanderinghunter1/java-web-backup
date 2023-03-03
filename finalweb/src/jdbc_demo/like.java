package jdbc_demo;

import java.sql.*;

import usedclass.*;

public class like {

    public static int  getlike(String textid)
    {
        int state = 0;

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
            ResultSet rs = stmt.executeQuery("select * from ilikeit ");
            //user 为你表的名称
            while (rs.next()) {
                if(textid.equals(rs.getString("textid"))) {
                    state += 1;
                }
            }
            //System.out.println("out : "+state);
        }
        catch (Exception e) {
            System.out.print("get data error!");
            e.printStackTrace();
        }
        return state;
    }


    public static int  iflike(String textid,String userid)
    {
        int state = 0;

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
            ResultSet rs = stmt.executeQuery("select * from ilikeit ");
            //user 为你表的名称
            while (rs.next()) {
                if(textid.equals(rs.getString("textid"))&&userid.equals(rs.getString("user"))) {
                    return 1;
                }
            }
            //System.out.println("out : "+state);
        }
        catch (Exception e) {
            System.out.print("get data error!");
            e.printStackTrace();
        }
        return state;
    }
    public static int  setlike (String userid, String textid)
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
            String sql="INSERT INTO ilikeit VALUES (?,?)";
            PreparedStatement stmt=connect.prepareStatement(sql);
            //stmt.setString();

//            System.out.print(account);
//            System.out.print(password);
//            System.out.print(webname);
//            System.out.print(email);

            stmt.setObject(1,textid);
            stmt.setObject(2,userid);

            state=stmt.executeUpdate();
            System.out.print("insert!");
        }
        catch (Exception e) {
            System.out.print("insert data error!");
            e.printStackTrace();
        }
        return state;
    }
    public static int  deletelike (String userid, String textid)
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
            String sql="delete from ilikeit where textid = ? and user = ? ";
            PreparedStatement stmt=connect.prepareStatement(sql);
            stmt.setObject(1,textid);
            stmt.setObject(2,userid);

            state=stmt.executeUpdate();
            System.out.print("insert!");
        }
        catch (Exception e) {
            System.out.print("insert data error!");
            e.printStackTrace();
        }
        return state;
    }


    public static mixcommit  getcommit(String textid)
    {
        mixcommit get=new mixcommit();

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
            ResultSet rs = stmt.executeQuery("select * from commit ");
            //user 为你表的名称
            while (rs.next()) {
                if(textid.equals(rs.getString("textid"))) {
                    commit c=new commit();
                    c.textid=rs.getString("textid");
                    c.inner=rs.getString("text");
                    c.userid=rs.getString("userid");
                    c.username=rs.getString("username");
                    get.textcommit.add(c);
                }
            }
            //System.out.println("out : "+state);
        }
        catch (Exception e) {
            System.out.print("get data error!");
            e.printStackTrace();
        }
        return get;
    }
    public static mixcommit  getusercommit(String userid)
    {
        mixcommit get=new mixcommit();

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
            ResultSet rs = stmt.executeQuery("select * from commit ");
            //user 为你表的名称
            while (rs.next()) {
                if(userid.equals(rs.getString("userid"))) {
                    commit c=new commit();
                    c.textid=rs.getString("textid");
                    c.inner=rs.getString("text");
                    c.userid=rs.getString("userid");
                    c.username=rs.getString("username");
                    c.commitid=rs.getString("commitid");
                    System.out.println("commitid out-------------------------------"+c.commitid);
                    get.textcommit.add(c);
                }
            }
            //System.out.println("out : "+state);
        }
        catch (Exception e) {
            System.out.print("get data error!");
            e.printStackTrace();
        }
        return get;
    }


}