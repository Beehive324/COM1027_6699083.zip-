package coursework_question2;

public class Offer {
	
	private double value;
	
	private User buyer;

	public User getBuyer() {
		return buyer;
	}
	
	
	

	public Offer(User buyer, double value) throws IllegalArgumentException{
		super();
		if(buyer == null) {//add the Exceptions
			throw new IllegalArgumentException("Invalid offer");
			
		}
		if(value < 0) {
			throw new IllegalArgumentException("Invalid offer value");
		}
		
		//insert code here
		this.value = value;
		this.buyer = buyer;
	}
	
	
	

	

    

	public double getValue() {
		return value;
	}




	@Override
	public String toString() {
		return this.buyer + " offered " + "£"+this.value;
	}
	
	
	

}
