package solarSystem;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class getInfoFromXMLConfigFile {
	
	public static ArrayList<CelestialBody> getConfig(String path) {
		
		ArrayList<CelestialBody> celestialBodies = new ArrayList<CelestialBody>();
		
		try {
			
			File inputFile = new File(path);
			
			SAXReader saxReader = new SAXReader();
			
			Document xmlDoc = saxReader.read(inputFile);
			
			Element config = xmlDoc.getRootElement();
			
			System.out.println(config);
			
			List<Element> elements = config.elements();
			
			for(Element e : elements) {
				
				System.out.println(e.elementText("name"));
				
				System.out.println(Float.parseFloat(e.elementText("velocity")));
				
				CelestialBody cb = new CelestialBody(e.elementText("name"), e.elementText("type"), e.elementText("color"), e.elementText("parent"), Float.parseFloat(e.elementText("radius")), Float.parseFloat(e.elementText("velocity")), Float.parseFloat(e.elementText("distanceToParent")), Float.parseFloat(e.elementText("xCoord")),Float.parseFloat(e.elementText("yCoord")));
				
				celestialBodies.add(cb);
				
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		return celestialBodies;
		
	}

}
