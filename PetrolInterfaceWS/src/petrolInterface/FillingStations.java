package petrolInterface;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dom4j.Element;

@Path("/PetrolInterface")

public class FillingStations {
		
	@GET
	@Path("/fuelstations")
	@Produces(MediaType.APPLICATION_XML)
	
	public ArrayList<FuelStations> getFuelStations(){
		
		return _ws.getFuelStations();
		
	}
	

}
