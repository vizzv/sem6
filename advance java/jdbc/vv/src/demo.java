

import java.sql.*;

public class demo {
    public static void main(String[] args) throws Exception{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        String dbUrl="jdbc:mysql://localhost:3306/student";
        String dbuser="root";
        String dbpass="";
        Connection con= DriverManager.getConnection(dbUrl, dbuser, dbpass);
        if(con!=null){
            System.out.println("connected");
        }
    }
}
