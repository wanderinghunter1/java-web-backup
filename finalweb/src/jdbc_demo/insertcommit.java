package jdbc_demo;

import java.sql.*;

public class insertcommit {


    public static int  insert (String textid, String text, String webname, String userid,String commitid)
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
            String sql="INSERT INTO commit VALUES (?,?,?,?,?)";
            PreparedStatement stmt=connect.prepareStatement(sql);
            //stmt.setString();

            stmt.setObject(1,textid);
            stmt.setObject(2,text);
            stmt.setObject(3,userid);
            stmt.setObject(4,webname);
            stmt.setObject(5,commitid);

            state=stmt.executeUpdate();
            System.out.print("insert!");
        }
        catch (Exception e) {
            System.out.print("insert data error!");
            e.printStackTrace();
        }
        return state;
    }
    public static String  getcommitmax()
    {
        int state=0;
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
                int temp=Integer.parseInt(rs.getString("commitid"));
                if(temp > state)
                {
                    state=temp;
                }
            }
            //System.out.println("out : "+state);
        }
        catch (Exception e) {
            System.out.print("get data error!");
            e.printStackTrace();
        }
        return String.valueOf(state+1);
    }





    public static int  deletecommit (String commitid)
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
            String sql="delete from commit where commitid = ?";
            PreparedStatement stmt=connect.prepareStatement(sql);
            //stmt.setString();
            //System.out.print(account);
            stmt.setObject(1,commitid);

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


}