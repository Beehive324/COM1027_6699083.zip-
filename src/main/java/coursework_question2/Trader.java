package coursework_question2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trader {
	
	
	//data types	
	protected String name;  


	//CarsForSale map
	protected HashMap<Advert, User> carsForSale = null;




	//SoldCars Map
	protected HashMap<Advert, User> soldCars = null;




	//Unsold cars map

	protected HashMap<User, Advert> unsoldCars = null;



	//Constructor
	public Trader (String name) {
		super();
		this.name = name; 
		this.carsForSale = new HashMap<Advert, User>();
		this.soldCars = new HashMap<Advert, User>();
		this.unsoldCars = new HashMap<User, Advert>();
		
	}

	public String displaynoSoldcars() { // String display method
		return "SOLD CARS:\n" ;
		
		//return "SOLD CARS:\nPurchased by"+ this.ID +"- Purchased by"+ this.name +" with a successful" + Offer.value +"bid."; 

		
	}


	//boolean method
	@SuppressWarnings("unused")
	private boolean checkExistence(Car car) { // checkExistence method
		
		return false;
		
	}

	public String displaySoldCars() { //String to diplay Sold Cars
		return "SOLD CARS:\n"; 
	}

	public String displayStatistics() { //String to display Statistics
		
		return "Statistics";
		
	}

	public String displayUnsoldCars() {  //String to display Unsold Cars
		
		
		return "UNSOLD CARS:\n";
		
	}

	public Trader endSale(Advert advert)throws IllegalArgumentException { 
		
		if(advert == null) {
			throw new IllegalArgumentException ("Invalid advert"); // IllegalArgumentException for advert
		}
		return null;
		}
		
		

	public boolean placeOffer(Advert carAdvert,User user, double value) throws IllegalArgumentException {
		if(carAdvert == null) {
			throw new IllegalArgumentException ("Invalid car advert"); // IllegalArgumentException for advert
		}
		if(user == null) {
			throw new IllegalArgumentException ("Invalid user, insert a valid user"); // IllegalArgumentException for user
		}
		
		return true;
		
	}
	  
	public Trader registerCar( Advert carAdvert, User user, String colour, CarType type,CarBody body, int noOFSeats)throws IllegalArgumentException {
		if(carAdvert == null) {
			throw new IllegalArgumentException ("Invalid car advert"); // illegal argument exception for the car advert
		}
		if(user == null) {
			throw new IllegalArgumentException ("Invalid user, insert a valid user"); // exception for the user
		}
		
		
		return null;
		
			
			
	}



	}
 