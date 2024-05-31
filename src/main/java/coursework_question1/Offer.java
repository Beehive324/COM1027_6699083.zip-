package coursework_question1;

public class Offer {
	
	private double value;
	
	private User buyer;

	public User getBuyer() {
		return buyer;
	}
	
	
	

	public Offer(User buyer, double value) throws IllegalArgumentException{  // Offer constructor
		super();
		if(buyer == null) {                    //add the Exceptions
			throw new IllegalArgumentException("Invalid offer");
			
		}
		if(value < 0) {
			throw new IllegalArgumentException("Invalid offer value");
		}
		
		//insert code here
		this.value = value;
		this.buyer = buyer;
		
		
		
	}


    

	public double getValue() { // value getter method
		return value;
	}




	public void setValue(double value) { // value setter method
		this.value = value;
	}




	public void setBuyer(User buyer) { //Buyer setter method
		this.buyer = buyer;
	}




	@Override
	public String toString() { // Offer toString
		return this.buyer + " offered " + "£"+this.value;
	}
	
	
	

}
