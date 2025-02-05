import java.sql.*;

class JDBCExample {
    public static void main(String[] arg) {
        String url = "jdbc:mysql://localhost:3306/sdi";
        String user = "root";
        String pass = "";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        CallableStatement cstmt = null;
        try {
            // Establish database connection
            con = DriverManager.getConnection(url, user, pass);
            stmt = con.createStatement();
            
            // Insert records into the stu table
            String sql1 = "INSERT INTO stu VALUES (69, 'mashmello')";
            stmt.executeUpdate(sql1);
            System.out.println("First insert successful");
            
            String sql2 = "INSERT INTO stu VALUES (33, 'daal chawal')";
            stmt.executeUpdate(sql2);
            System.out.println("Second insert successful");
            
            // Retrieve all records from the stu table
            String sql3 = "SELECT * FROM stu";
            rs = stmt.executeQuery(sql3);
            System.out.println("All Records:");
            while (rs.next()) {
                System.out.printf("%-10d %-20s%n", rs.getInt(1), rs.getString(2));
            }
            
            // Batch execution for inserting multiple records
            stmt.addBatch("INSERT INTO stu VALUES (95, 'pani puri')");
            stmt.addBatch("INSERT INTO stu VALUES (55, 'cajma chawal')");
            int[] batchResults = stmt.executeBatch();
            System.out.println("Batch executed successfully");
            
            // Query for roll numbers greater than 10
            String sql4 = "SELECT * FROM stu WHERE roll_no > 10";
            rs = stmt.executeQuery(sql4);
            System.out.println("Records with roll number > 10:");
            while (rs.next()) {
                System.out.printf("%-10d %-20s%n", rs.getInt(1), rs.getString(2));
            }
            
            // Calling stored procedure 'show_stu'
            cstmt = con.prepareCall("{CALL show_stu()}");
            rs = cstmt.executeQuery();
            System.out.println("Records from stored procedure 'show_stu':");
            while (rs.next()) {
                System.out.printf("%-10d %-20s%n", rs.getInt(1), rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (cstmt != null) cstmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}