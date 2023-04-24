import java.sql.*;
public class callableStatement {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/student";
        String user="root";
        String pass="";
        Connection con =DriverManager.getConnection(url, user, pass);
        if(con!=null){
            System.out.println("Connected");
            CallableStatement cb=con.prepareCall("CALL sp()");
            cb.execute();
            System.out.println("modification is done using callable statement");
        }
        
    }
}