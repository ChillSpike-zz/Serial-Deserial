package serial;
import java.sql.*;



public class DB__Connect {

	private static Connection conn;
	public void connectMysql() {
        try
        {
            final String myDriver = "com.mysql.jdbc.Driver";
            final String myUrl = "jdbc:mysql://localhost:3306/mysql";
            Class.forName(myDriver);
            conn = DriverManager.getConnection(myUrl, "root", "");
            //getData();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
}
	
	public void getData() {
		 String query = "SELECT * FROM test";
         Statement st;
		try {
			st = conn.createStatement();
		
         ResultSet rs = st.executeQuery(query);

         while (rs.next())
         {
             int id = rs.getInt("id");
             String firstName = rs.getString("firstname");
             String lastName = rs.getString("lastname");
             System.out.format("%s, %s, %s\n", id, firstName, lastName);
         }
         st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public void getRole(String role) {
		System.out.println("Getting roles..\n");
		String query = "SELECT * FROM test where role=\""+role+"\"";
         Statement st;
         
		try {
			st = conn.createStatement();
		
         ResultSet rs = st.executeQuery(query);

         while (rs.next())
         {
             int id = rs.getInt("id");
             String firstName = rs.getString("firstname");
             String lastName = rs.getString("lastname");
             String roles = rs.getString("role");
             System.out.println("ID \t firstname\t lastname\t role" );
             System.out.println("---- -------- ----------- ------------- -------------- ");
             System.out.format("%s,\t %s,\t %s,\t %s\n", id, firstName, lastName,roles);
         }
         st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}