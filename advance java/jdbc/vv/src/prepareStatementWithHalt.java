import java.sql.*;
public class prepareStatementWithHalt {
    
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/student";
        String user="root";
        String pass="";
        Connection con =DriverManager.getConnection(url, user, pass);
        if(con!=null){
            System.out.println("Connected");
            String q="insert into ce values(?,?,?)";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setInt(1, 10);
            ps.setString(2,"KajuKoya");
            ps.setString(3, "A");
            ps.execute(); 
            System.out.println("Values modified using preparedStatement");
        }
        
    }
}

