import java.sql.*;
class resultSetNavigationalUpdatable{

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/student";
        String user="root";
        String pass="";
        Connection con=DriverManager.getConnection(url,user,pass);
        String sql="Select * from ce";
        if(con!=null){
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            //System.out.println("Roll no "+rs.getInt(1));
            rs.updateString(2, rs.getString(2).toUpperCase());
            rs.updateRow();
            System.out.println("changed to roll no "+rs.getString(2));
            }
            
        }

        
    }
}