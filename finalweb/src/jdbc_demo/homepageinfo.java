package jdbc_demo;

import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.*;
import usedclass.homepage01;
import usedclass.mixhomepage01;

public class homepageinfo {

    public static String cutString(String str, int len) throws UnsupportedEncodingException {

                 byte[] buf = str.getBytes("utf-8");
                 int count = 0;
                 for (int x = len - 1; x >= 0; x--) {
                        if (buf[x] < 0) {
                                 count++;
                             } else {
                                 break;
                             }
                     }
                 if (count % 3 == 0) {
                         return new String(buf, 0, len, "utf-8");
                     } else if (count % 3 == 1) {
                         return new String(buf, 0, len - 1, "utf-8");
                     } else {
                         return new String(buf, 0, len - 2, "utf-8");
                     }
             }

             public  static  int getlength(String str)
             {
                    int state=0;
                    return str.length();
             }

    public static mixhomepage01 gethomepage(String id) {
        // link out the contains of no.id , just the textid
        //int state = 0;
        mixhomepage01 outmix = new mixhomepage01();
        //outmix.list
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
            try (ResultSet rs = stmt.executeQuery("select * from title")) {
                //user 为你表的名称
                System.out.println("finding");
                while (rs.next()) {
                    if (id.equals(rs.getString("id"))) {
                        homepage01 input = new homepage01();
                        input.id = rs.getString("innerid");
                        input.textid = rs.getString("textid");
                        //outmix.add(input);
                        //outmix.out.add(input);

                        outmix.list.add(input);
                        //System.out.println(outmix.list.get(0).textid);
                        //System.out.println("find" + state);
                    }
                }
            }
        } catch (Exception e) {
            System.out.print("get data error!");
            e.printStackTrace();
        }

        return outmix;
    }
    public static mixhomepage01 getzonepage(String zoneid) {
        // link out the contains of no.id , just the textid
        int state = 0;
        mixhomepage01 outmix = new mixhomepage01();
        //outmix.list
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
                while (rs.next()) {
                    if (zoneid.equals(rs.getString("zoneid"))) {
                        homepage01 input = new homepage01();
                        input.id = String.valueOf(state);
                        input.textid = rs.getString("textid");
                        state+=1;
                        outmix.list.add(input);
                    }
                }
            }
        } catch (Exception e) {
            System.out.print("get data error!");
            e.printStackTrace();
        }

        return outmix;
    }

    public static mixhomepage01 getalltext() {
        // link out the contains of no.id , just the textid
        //int state = 0;
        mixhomepage01 outmix = new mixhomepage01();
        //outmix.list
        int state=0;
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
            try (ResultSet rs = stmt.executeQuery("select * from text ")) {
                //user 为你表的名称
                System.out.println("finding");
                while (rs.next()) {
                        homepage01 input = new homepage01();
                        input.id = String.valueOf(state);
                        input.textid = rs.getString("textid");
                        state+=1;
                        outmix.list.add(input);
                }
            }
        } catch (Exception e) {
            System.out.print("get data error!");
            e.printStackTrace();
        }

        return outmix;
    }

    public static int sethomepage(String id, String innerid, String textid) {
        // link out the contains of no.id , just the textid
        int state = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");     //加载MYSQL JDBC驱动程序
            //Class.forName("org.gjt.mm.mysql.Driver");
            //System.out.println("Success loading Mysql Driver!");
        } catch (Exception e) {
            System.out.print("Error loading Mysql Driver!");
            e.printStackTrace();
        }
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/webtest?serverTimezone=UTC", "root", "123321");
            //PreparedStatement stmt=null;
            ResultSet rs = null;
            String sql = "update title set textid = ?  where id = ? and innerid =?";
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setObject(1, textid);
            stmt.setObject(2, id);
            stmt.setObject(3, innerid);
            state = stmt.executeUpdate();
            System.out.print("main page " + id + " updated over!");
        } catch (Exception e) {
            System.out.print("get data error!");
            e.printStackTrace();
        }

        return state;
    }

}

