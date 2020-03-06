package solarSystem;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		
		String path;
		try {
			path = new File(".").getCanonicalPath() + System.getProperty("file.separator") + "src" + System.getProperty("file.separator") + "solarSystem" + System.getProperty("file.separator") + "Configuration.xml";
			
			System.out.println(path);
			
			ArrayList<CelestialBody> cBodies = getInfoFromXMLConfigFile.getConfig(path);
			
			for(CelestialBody cb : cBodies) {
				
				System.out.println(cb.getName());
				
			}
			
			List<CelestialBody> father = cBodies.stream().filter( p -> p.getFather().equals("none")).collect(Collectors.toList());
			
			for(CelestialBody celestB : father) {
				
				System.out.println(celestB.getName());
				
				for(CelestialBody cb : cBodies) {
					
					cb.orbiting(celestB.getxCoord(), celestB.getyCoord(), cb.getRadius(), cb.getOrbitalPeriod(), cb.getVelocity(), 1000);
					
					System.out.println(cb.getxCoord());
					System.out.println(cb.getyCoord());
					
				}
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
