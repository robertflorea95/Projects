package playgroundUsers;

import java.sql.*;


public class connectToDatabase {

	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@db-ora-wm9ROt:2359:WM9ROT";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Statement stmnt = null;
		Connection conn = null;
		
		try {
			
			Class.forName(JDBC_DRIVER);
			
			String URL = "jdbc:mysql://db-ora-wm9ROt:2359:WM9ROT";
			conn = DriverManager.getConnection(DB_URL,"WMROCONFT","omv123");
			
			System.out.println("Connected to the database");
			
			stmnt = conn.createStatement();
			
			String sql = "Select * from TAS_CONFIG";
			
			ResultSet result = stmnt.executeQuery(sql);
			
			while(result.next()) {
				
				System.out.println("Terminal ID:"+result.getString("TERMINALID")+"\n"+"NAME:"+result.getString("NAME"));
				
			}
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}finally {
			try {
				if(stmnt!=null) {
					
					conn.close();
				}
				
			}catch(SQLException se) {
				
				se.printStackTrace();
				
			}
			
		}
		
		
	}

}
