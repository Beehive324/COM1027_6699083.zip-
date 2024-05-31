package coursework_question4;

public enum CarBody {
	
	MICRO(1), SEDAN(2), HATCHBACK(3), ROADSTER(4), PICKUP(5),
	
	VAN(6), COUPE(7), SUPERCAR(8), CABRIOLET(9);
	
	private int value;
	
	private CarBody(int value) {
		this.value = value;			
	}
	
	public int getGetValue() {
		return value;
	}

}
