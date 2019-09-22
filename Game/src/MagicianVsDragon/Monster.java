package MagicianVsDragon;

import java.util.Random;

public class Monster {
	
	protected int health;
	protected int attack;
	
	public Monster() {
		
		health = 100;
		attack = 0;
		
	}

	public int Attack() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int getHealth() {
		
		return this.health;
		
	}
	
	public void setHealth(int attack) {
		
		this.health = this.health - attack;
		
	}

}
