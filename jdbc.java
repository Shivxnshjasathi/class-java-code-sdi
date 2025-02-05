import java.sql.*;


class jdbc {
    public static void main (String []arg){
        try{
            String url = "jdbc:mysql://localhost:3306/sdi";
            String user = "root";
            String pass="";
            DriverManager.getConnection(url, user, pass);
            System.out.println("scccess");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
