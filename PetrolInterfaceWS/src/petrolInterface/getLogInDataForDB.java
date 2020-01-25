package petrolInterface;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.lang.model.util.Elements;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class getLogInDataForDB {
	
	public static  List<Element> getConfig(String path) {
		
		List<Element> configNodes = new ArrayList<Element>();
		
		try {
			
		File inFile = new File(path);
		SAXReader saxReader = new SAXReader();
		
		Document xmlDoc = saxReader.read(inFile);
		
		Element config = xmlDoc.getRootElement();
		
		configNodes = config.elements();
		
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return configNodes;
		
	}

}
