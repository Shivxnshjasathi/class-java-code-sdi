import java.sql.*;


class jdbc {
    public static void main (String []arg){
        try{
            String url = "jdbc:mysql://localhost:3306/sdi";
            String user = "root";
            String pass="";
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt=con.createStatement();
            String sql = "Insert into stu values(100,'paja')";
            stmt.execute(sql);

            System.out.println("scccess");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
