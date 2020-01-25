package petrolInterface;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Element;

public class _ws {
	
static private final java.nio.file.Path path = Paths.get("C:\\Users\\rober\\git\\repository\\playground\\src\\petrolInterface\\configForDB.xml");
	
	static List<Element> config = getLogInDataForDB.getConfig(path.toString());
	
	static ArrayList<FuelStations> getFuelStations(){
		
		return getDataFromDB.getDataFromDataBase(config);
		
	}

}
