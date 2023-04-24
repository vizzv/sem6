/*
 * write a java program for banking application in which bank table with
 * account no,customer no,address & perform following operation.
 * 1> insert two records using prepared statement
 * 2> display all the records.
 */
import java.sql.*;
public class gtuQuestion1 {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/knsb";
        String user="root";
        String pass="";
        Connection con =DriverManager.getConnection(url, user, pass);
        if(con!=null){
            String q="insert into scienceCity values (3,2,'ss'),(2,4,'vv')";
            PreparedStatement ps=con.prepareStatement(q);
            ps.executeUpdate(q);
            Statement s=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=s.executeQuery("Select * from scienceCity");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3));
            }
        }
    }
}
