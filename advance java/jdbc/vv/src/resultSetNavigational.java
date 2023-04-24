import java.sql.*;
class resultSetNavigational{

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/student";
        String user="root";
        String pass="";
        Connection con=DriverManager.getConnection(url,user,pass);
        String sql="Select * from ce";
        if(con!=null){
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs=st.executeQuery(sql);
            rs.first();
            System.out.println("Roll no "+rs.getInt(1));
            
            rs.last();
            System.out.println("Roll no "+rs.getInt(1));
            rs.previous();
            System.out.println("Roll no "+rs.getInt(1));
        }

        
    }
}