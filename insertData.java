import java.sql.*;
public class insertData {
	public static void main(String args[]) {
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","CRIMINALDB","system");
			
			Statement st=con.createStatement();
			
			st.execute("select * from criminal");
			
			con.close();
		}
		catch(Exception e) {
			System.err.println("An Exception!");
		}
	}

}
