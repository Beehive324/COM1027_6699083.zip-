package coursework_question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Advert {
	//attributes
	private Car car; // variables
	
	private List<Offer> offers = null; // list
	
	
	public Advert(Car car) {          //constructor
		super();
		this.car = car;
		this.offers = new ArrayList<Offer>();
	}
	

	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}

	
	
	//methods
	public Offer getHighestOffer() throws IllegalArgumentException{
		
		double nom = 0;
		
		Offer kop = null;
		
		for (int index = 0; index < offers.size();index++){
			if(offers.get(index).getValue() > nom) {
				kop = offers.get(index);
				nom = offers.get(index).getValue();
				
			}
					
				}
		if(offers == null) {
			throw new IllegalArgumentException ("Invalid offers");
		}
		
		return null;
		
	}
	
	
	public boolean placeOffer(User buyer, double value) { // placeOffer method
		{
			List<Offer> display = this.offers; 
			boolean output = false;
			if (this.offers.contains(display)) {
				output = true;
			}
			return output;
		}
		}
		
	{
	}

	@Override
	public String toString() {
		return "Ad:" + "-" + car.getID() + car.getName() +  "(" + car.getPrice() + ")" + "\n" + "Type:" + CarType.MANUAL + "\n" + "Style:" + CarBody.MICRO + "\n" + car.getColour() + "\n"+ car.getNumberOfSeats() + "\n" + Condition.NEW;
	}
	
	

}
