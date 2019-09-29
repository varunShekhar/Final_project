import java.sql.*;
public class showData {
	public static void main(String args[]) {
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","CRIMINALDB","system");
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("select * from criminal");
			System.out.println("ID"+" "+"NAME"+" "+"AGE"+" "+"BLOOD_GROUP"+" "+"GENDER"+" "+"WORK_ASSIGNED"+" "+"CURRENT LOCATION");
			while(rs.next()) {
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getInt(3)+" ");
				System.out.print(rs.getString(4)+" ");
				System.out.print("  "+rs.getString(5)+" ");
				System.out.print("  "+rs.getString(6)+" ");
				System.out.println("      "+rs.getString(7)+" ");
				
			}
			
			con.close();
		}
		catch(Exception e) {
			//System.err.println("An Exception!");
			e.printStackTrace(); 
            System.out.println(e); 
		}
	}

}
