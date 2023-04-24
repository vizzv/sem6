import java.sql.*;
class resultSet{

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/student";
        String user="root";
        String pass="";
        Connection con=DriverManager.getConnection(url,user,pass);
        String sql="Select * from ce";
        if(con!=null){
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                System.out.println("Roll no: "+rs.getInt(1));
            }
        }

        
    }
}