package MagicianVsDragon;

import java.util.Random;

public class Dragon extends Monster{
	
	private String name;
	private int id;
	
	public Dragon(){
		
		this.name = "Blue-Eyes White Dragon";
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	@Override
	public int Attack() {
		
		Random rand = new Random();
		
		this.attack = rand.nextInt((15-10) + 1) + 10;
		
		return attack;
		
	}
	
	public int getId(){
		
		return this.id;
		
	}
	
	public void setId(int id) {
		
		this.id = id;
		
	}
	
	

}
