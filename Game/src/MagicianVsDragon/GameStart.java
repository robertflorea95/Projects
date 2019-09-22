package MagicianVsDragon;

import java.util.Random;

public class GameStart {
	
	private Random rand = new Random();
	
	private int identifier;
	
	private boolean endGame;
	
	Magician magician = new Magician();
	
	Dragon dragon = new Dragon();
	
	public void start() {
		
		magician.setId(rand.nextInt(2) + 1);
		
		if(magician.getId() == 1) {
			
			dragon.setId(2);
			
		}else dragon.setId(1);
		
		
		
		System.out.println("===Magician vs Dragon===");
		System.out.println("=======Mini-Game========");
		System.out.println("");
		
		while(endGame != true) {
			
			identifier = rand.nextInt(2) + 1;
		
			if(identifier == magician.getId()) {
				
				System.out.printf("%s attacks %n", magician.getName());
				
				dragon.setHealth(magician.Attack());
			
				
			}else {
				
				System.out.printf("%s attacks %n", dragon.getName());
				
				magician.setHealth(dragon.Attack());
				
			}
			
			if(dragon.getHealth() <= 0) {
				
				endGame = true;
				
			}else {
				
				if(magician.getHealth() <= 0) {
					
					endGame = true;
					
				}
				
			}
			
		}
		
		if(magician.getHealth() <= 0 && dragon.getHealth() > 0) {
			
			System.out.printf("%s defeated %s! All hope is lost%n", dragon.getName(), magician.getName());
			
		}else {
			
			if(magician.getHealth() > 0 && dragon.getHealth() <= 0) {
				
				System.out.printf("%s slayed the %s ! We are all saved!%n", magician.getName(), dragon.getName());
				
			}else {
				
				if(magician.getHealth() == 0 && dragon.getHealth() == 0) {
					
					System.out.printf("%s died in the battle with the %s but defeated it. We survived at the cost of the sacrifice of %s!", magician.getName(),dragon.getName(),magician.getName());
					
				}
				
			}
			
			
			
		}
		
		
	}
	
	

}
