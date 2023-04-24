import java.sql.*;
import java.util.Scanner;
public class transaction {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/student";

        Connection cn= DriverManager.getConnection(url, "root","");
        if(cn!=null){
            cn.setAutoCommit(false);
           Statement st= cn.createStatement();
           String sql="insert into ce  values(6,'AB','A')";
           st.executeUpdate(sql);
           System.out.println("enter r for rollback and neter c for commit");
           Scanner sc = new Scanner(System.in);
           String Op=sc.next();
           if(Op.equals("c")){
            cn.commit();
           }
           else if(Op.equals("r")){
            cn.rollback();
           }
        }
    }
}
