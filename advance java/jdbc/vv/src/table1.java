import java.sql.*;
public class table1 {
    
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String dbUrl="jdbc:mysql://localhost:3306/student";
        String dbuser="root";
        String dbPass="";
        Connection con=DriverManager.getConnection(dbUrl,dbuser,dbPass);
        if(con!=null){
            System.out.println("connected");
            Statement s1=con.createStatement();
            //String qqString= new String("insert into CE Values(153,'vishw', 'e')");
            //s1.executeUpdate(qqString);
            String qqString= new String("INSERT INTO ce VALUES(10,'SANTHOSH','E1'),(20,'THAMAN','E3'),(30,'HARSH','E1'),(40,'SAMHITH','E10');");
            int rowss= s1.executeUpdate(qqString);
            System.out.println("row affected "+rowss);
            con.close();
        }
    }
}
