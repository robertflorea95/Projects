package petrolInterface;

public class FuelStations {

	private int ID;
	private String name;
	private int status;
	private String location;
	private String country;
	
	public FuelStations() {
		
		this.ID = 0;
		this.name = null;
		this.status = 0;
		this.location = null;
		this.country = null;
		
	}
	
	public FuelStations(int ID, String name, int status, String location, String country){
		
		this.ID = ID;
		this.name = name;
		this.status = status;
		this.location = location;
		this.country = country;
		
	}
	
	void setID(int ID) {
		
		this.ID = ID;
		
	}
	
	void setName(String name) {
		
		this.name = name;
		
	}
	
	void setStatus(int status) {
		
		this.status = status;
		
	}
	
	void setLocation(String location) {
		
		this.location = location;
		
	}
	
	void setCountry(String country) {
		
		this.country = country;
		
	}
	
	int getID() {
		
		return this.ID;
		
	}
	
	String getName() {
		
		return this.name;
		
	}
	
	int getStatus() {
		
		return this.status;
		
	}
	
	String getLocation() {
		
		return this.location;
		
	}
	
	
	String getCountry() {
		
		return this.country;
		
	}
}
