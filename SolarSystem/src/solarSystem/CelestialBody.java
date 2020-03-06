package solarSystem;

public class CelestialBody {
	
	private String name;
	private String type;
	private String color;
	private String father;
	private float radius;
	private float velocity;
	private float distanceToParent;
	private float orbitalPeriod;
	private float xCoord;
	private float yCoord;
	
	public CelestialBody(String name, String type, String color, String parent, float radius, float velocity, float distanceToParent, float orbitalPeriod, float xCoord, float yCoord) {
		
		this.name = name;
		this.type = type;
		this.color = color;
		this.father = parent;
		this.radius = radius;
		this.velocity = velocity;
		this.distanceToParent = distanceToParent;
		this.orbitalPeriod = orbitalPeriod;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getVelocity() {
		return velocity;
	}

	public void setVelocity(float velocity) {
		this.velocity = velocity;
	}

	public float getDistanceToParent() {
		return distanceToParent;
	}

	public void setDistanceToParent(float distanceToParent) {
		this.distanceToParent = distanceToParent;
	}

	public float getxCoord() {
		return xCoord;
	}

	public void setxCoord(float xCoord) {
		this.xCoord = xCoord;
	}

	public float getyCoord() {
		return yCoord;
	}

	public void setyCoord(float yCoord) {
		this.yCoord = yCoord;
	}
	
	public float getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public void setOrbitalPeriod(float orbitalPeriod) {
		this.orbitalPeriod = orbitalPeriod;
	}
	
	public void orbiting(float parentXCoord, float parentYCoord, float radius, float orbitalPeriod, float velocity, int time) {
		
		float radian = velocity * time;
		this.xCoord = (float) (parentXCoord + radius * Math.cos(radian));
		this.yCoord = (float) (parentYCoord + radius * Math.sin(radian));
		
	}

}