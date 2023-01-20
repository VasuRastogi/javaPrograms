package Java.LearningJava.JDBC;

import java.sql.*;

public class jdbcConnection {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDb", "root", "root");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from Persons");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(3));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
