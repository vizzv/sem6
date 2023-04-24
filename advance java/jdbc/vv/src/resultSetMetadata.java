import java.sql.*;
class resultSetMetadata{

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
            ResultSetMetaData rsm=rs.getMetaData();
            //System.out.println("Table name is "+rsm.getTableName(1));
            //System.out.println("Number of columns is "+rsm.getColumnCount());
            //System.out.println("Name of first column "+rsm.getColumnName(1));
            //System.out.println("length of datatype "+rsm.getColumnType(1));
            //System.out.println(rsm.getColumnClassName(1));
            //System.out.println(rsm.getColumnTypeName(1));
            int count=(int)rsm.getColumnCount();
            while(count>0){
                System.out.println(rsm.getColumnName(count));
                System.out.println("Table name is "+rsm.getTableName(count));
                System.out.println("Name of first column "+rsm.getColumnName(count));
                System.out.println("length of datatype "+rsm.getColumnType(count));
                System.out.println(rsm.getColumnClassName(count));
                System.out.println(rsm.getColumnTypeName(count));
                System.out.println("------------------------");
                count--;
            }

            
        }

        
    }
}