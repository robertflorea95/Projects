package MagicianVsDragon;

import java.util.Random;

public class Magician extends Monster{
	
	private String name;
	private int id;
	
	public Magician() {
		
		this.name = "Dark Magician";
		
	}
	
	@Override
	public int Attack() {
		
		Random rand = new Random();
		
		this.attack = rand.nextInt((15-10) + 1) + 10;
		
		return attack;
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	public int getId(){
		
		return this.id;
		
	}
	
	public void setId(int id) {
		
		this.id = id;
		
	}

}
