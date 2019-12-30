package petrolInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.dom4j.Element;
import org.dom4j.Node;

public class getDataFromDB {
	
	private static ArrayList<FuelStations> fsArray = new ArrayList<FuelStations>();
	
	private static String path = "C:\\Users\\rober\\git\\repository\\playground\\src\\petrolInterface\\configForDB.xml";	
	
	public static ArrayList<FuelStations> getDataFromDB(List<Element> config) throws SQLException{
		
	config = getLogInDataForDB.getConfig(path);
		
	String dbName = config.get(0).getStringValue();
	
	String hostname = config.get(1).getStringValue();
	
	String port = config.get(2).getStringValue();
	
	String user = config.get(3).getStringValue();
	
	String password = config.get(4).getStringValue();
	
	
	String JDBC_DRIVER ="com.mysql.jdbc.Driver";
	String DB_URL = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName;
	
	Connection conn = null;
	Statement stmt = null;
	
	ResultSet result = null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("Connecting to the database...");
		
		conn = DriverManager.getConnection(DB_URL, user, password);
		
		System.out.printf("Connected to the %s database \n",dbName);
		
		stmt = conn.createStatement();
		
		String selectSQL = "SELECT * FROM " + dbName;
		
		result = stmt.executeQuery(selectSQL);
		
		while(result.next()) {
			
			FuelStations fs = new FuelStations(result.getInt("ID"),result.getString("NAME"),result.getInt("STATUS"),result.getString("LOCATION"),result.getString("COUNTRY"));
			
			fsArray.add(fs);
			
		}
		
		result.close();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}finally {
		
		conn.close();
		
	}
	
	return fsArray;
	
		
	}
	
	
}