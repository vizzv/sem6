import java.sql.*;
public class resultSetDatabaseMetadata  {
    
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/student";
        String user="root";
        String pass="";
        Connection con=DriverManager.getConnection(url,user,pass);
        DatabaseMetaData dbm = con.getMetaData();
        System.out.println("Name of metadata is "+dbm.getDatabaseProductName());
        
        System.out.println("username of d.b "+dbm.getUserName());
        System.out.println("driver Name "+dbm.getDriverName());
    }
}
