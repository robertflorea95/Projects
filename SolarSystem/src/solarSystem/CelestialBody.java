package solarSystem;

public class CelestialBody {
	
	private String name;
	private String type;
	private String color;
	private String parent;
	private float radius;
	private float velocity;
	private float distanceToParent;
	private float xCoord;
	private float yCoord;
	
	public CelestialBody(String name, String type, String color, String parent, float radius, float velocity, float distanceToParent, float xCoord, float yCoord) {
		
		this.name = name;
		this.type = type;
		this.color = color;
		this.parent = parent;
		this.radius = radius;
		this.velocity = velocity;
		this.distanceToParent = distanceToParent;
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

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
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
	
	public static void orbiting() {
		
		
		
	}

}