
import java.sql.*;

class jdbcOdbc{
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/student";
        String user="root";
        String pass="";
        Connection con =DriverManager.getConnection(url, user, pass);
        if(con!=null){
            System.out.println("Connected");
            String q="update ce set Name='v' where RollNo=100";
            PreparedStatement ps=con.prepareStatement(q);
            ps.execute(); 
            System.out.println("Values inserted using preparedStatement");
        }
        
    }
}