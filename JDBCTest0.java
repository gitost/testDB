import java.sql.*;


public class JDBCTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		DriverManager.registerDriver( new oracle.jdbc.driver.OracleDriver());
		
		String url="jdbc:oracle:thin:@//wi-dbora:1521/dbk.de";
		
		
		Connection con = DriverManager.getConnection(url, "ora102", "");
		
		String sql = "select * from projekt";
		
		PreparedStatement psmt = con.prepareStatement(sql);
		
		 ResultSet rs = psmt.executeQuery();
		 
		 while(rs.next()){
			 
			 System.out.println(rs.getString("NAME"));
		 }
			
	}

}
