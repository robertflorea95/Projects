package petrolInterface;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.dom4j.Element;
import org.dom4j.Node;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner input = new Scanner(System.in);
		String path = "C:\\Users\\rober\\git\\repository\\playground\\src\\petrolInterface\\configForDB.xml";
		
		List<Element> config = getLogInDataForDB.getConfig(path);
						
		ArrayList<FuelStations> SQLData = getDataFromDB.getDataFromDataBase(config);
		
		for(int i = 0; i<SQLData.size();i++) {
			
			System.out.println("ID: " + SQLData.get(i).getID());
			System.out.println("NAME: " + SQLData.get(i).getName());
			System.out.println("STATUS: " + SQLData.get(i).getStatus());
			System.out.println("LOCATION: " + SQLData.get(i).getLocation());
			System.out.println("COUNTRY: " + SQLData.get(i).getCountry());
			System.out.println("-------------------------------------");
			
		}
		
	}

}
