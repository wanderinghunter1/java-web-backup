package jdbc_demo;

import javax.sql.rowset.spi.SyncResolver;
import java.sql.*;

public class insert {


    public static int  insert (String account, String password, String webname, String email)
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
                    //state = 0;
                    return 0;
                }
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/webtest?serverTimezone=UTC","root","123321");
            //PreparedStatement stmt=null;
            ResultSet rs=null;
            String sql="INSERT INTO user VALUES (?,?,?,?,?)";
            PreparedStatement stmt=connect.prepareStatement(sql);
            //stmt.setString();

            System.out.print(account);
            System.out.print(password);
            System.out.print(webname);
            System.out.print(email);

            stmt.setObject(1,account);
            stmt.setObject(2,password);
            stmt.setObject(3,webname);
            stmt.setObject(4,email);
            stmt.setObject(5,"0");

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