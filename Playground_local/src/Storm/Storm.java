package Storm;

class Storm {
	
	protected double eyeRadius;
    protected double eyePositionX;
    protected double eyePositionY;
    private double amountOfSnow;
    
    public void RainStorm(double eyeRadius, double eyePositionX, double eyePositionY) {
    	this.eyeRadius = eyeRadius;
		this.eyePositionX = eyePositionX;
		this.eyePositionY = eyePositionY;
    }
    
    public boolean isInEyeOfTheStorm(double positionX, double positionY) {
		return false;
        
    }

    public double amountOfRain() {
		return 0;
        
    }
    
	public double getEyeRadius() {
		return 0;
		
		
	}

	public double getEyePositionX() {
		return eyePositionX;
		
	}

	public double getEyePositionY() {
		return eyePositionY;
		
	}
	
	public void SnowStorm(double eyeRadius, double eyePositionX, double eyePositionY, double amountOfSnow) {
		
	}

	public double getAmountOfSnow() {
		return amountOfSnow;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Storm s = new Storm();
		
		RainStorm rs = new RainStorm(1.1,2.2,3.2);
		
		System.out.println(rs.amountOfRain());
		
		System.out.println(s.amountOfRain());
		
	}
	
}

class RainStorm extends Storm {
    protected double eyeRadius;
    protected double eyePositionX;
    protected double eyePositionY;

    public RainStorm(double eyeRadius, double eyePositionX, double eyePositionY) {
		this.eyeRadius = eyeRadius;
		this.eyePositionX = eyePositionX;
		this.eyePositionY = eyePositionY;
    }

    public boolean isInEyeOfTheStorm(double positionX, double positionY) {
        double distance = Math.sqrt(Math.pow(positionX - eyePositionX, 2) +
                                    Math.pow(positionY - eyePositionY, 2));
        return distance < eyeRadius;
    }

    public double amountOfRain() {
        return eyeRadius * 20;
    }
    
    @Override
	public double getEyeRadius() {
		return eyeRadius;
	}

	public double getEyePositionX() {
		return eyePositionX;
	}

	public double getEyePositionY() {
		return eyePositionY;
	}
}

class SnowStorm extends Storm {
    
    protected double eyeRadius;
    protected double eyePositionX;
    protected double eyePositionY;
    private double amountOfSnow;

    public SnowStorm(double eyeRadius, double eyePositionX, double eyePositionY, double amountOfSnow) {
		this.eyeRadius = eyeRadius;
		this.eyePositionX = eyePositionX;
		this.eyePositionY = eyePositionY;
		this.amountOfSnow = amountOfSnow;
	}

	public double getAmountOfSnow() {
		return amountOfSnow;
	}
    
	public boolean isInEyeOfTheStorm(double positionX, double positionY) {
        double distance = Math.sqrt(Math.pow(positionX - eyePositionX, 2) +
                                    Math.pow(positionY - eyePositionY, 2));
        return distance < eyeRadius;
    }

	public double getEyeRadius() {
		return eyeRadius;
	}

	public double getEyePositionX() {
		return eyePositionX;
	}

	public double getEyePositionY() {
		return eyePositionY;
	}
}