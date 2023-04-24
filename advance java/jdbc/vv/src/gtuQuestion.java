/*
 * write java program to basic=basic+50 all the employee 
 * whose age is greater than 40 from employeeTable
 * then display the updated table
 */
import java.sql.*;
public class gtuQuestion {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/employee";
        String userName="root";
        String pass="";

        Connection con=DriverManager.getConnection(url, userName, pass);
        if(con!=null){
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String Qry="select * from employee ";
            ResultSet rs=st.executeQuery(Qry);
            while(rs.next()){
                if(rs.getInt("Age")>40){
                    rs.updateInt("Basic", rs.getInt("Basic")+500);
                    rs.updateRow();
                } 
                System.out.println(rs.getInt("Id")+" "+rs.getString("Name")+" "+rs.getInt("Age")+" "+rs.getInt("Basic")+" ");
            }
        }
    }
}
