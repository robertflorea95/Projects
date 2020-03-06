package solarSystem;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		String path;
		try {
			path = new File(".").getCanonicalPath() + System.getProperty("file.separator") + "src" + System.getProperty("file.separator") + "SolarSystem" + System.getProperty("file.separator") + "Configuration.xml";
			
			System.out.println(path);
			
			ArrayList<CelestialBody> cBodies = getInfoFromXMLConfigFile.getConfig(path);
			
			for(CelestialBody cb : cBodies) {
				
				System.out.println(cb.getName());
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
