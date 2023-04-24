import java.sql.*;
public class table {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String dbUrl="jdbc:mysql://localhost:3306/student";
        String dbuser="root";
        String dbPass="";
        Connection con=DriverManager.getConnection(dbUrl, dbuser, dbPass);
        if(con!=null){
            System.out.println("connected");
            Statement st=con.createStatement();
            String sql="Create table CE(RollNo int(5), Name Varchar(15),Division Varchar(3))";
            
            st.executeUpdate(sql);
            System.out.println("Table Created");
            con.close();
        }
        
    }
}
