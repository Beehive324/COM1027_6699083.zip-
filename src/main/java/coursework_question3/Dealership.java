package coursework_question3;

import java.util.HashMap;
import java.util.Map;

import coursework_question3.Advert;
import coursework_question3.Auctioneer;
import coursework_question3.CarBody;
import coursework_question3.CarType;
import coursework_question3.User;

public abstract class Dealership {
	
		
			
	//data types	
	protected String name; 


	//CarsForSale map
	protected HashMap<Advert, Seller> carsForSale = new HashMap<Advert,Seller>();


	//Sold Cars Map
	protected HashMap<Advert, Buyer> soldCars = new HashMap<Advert,Buyer>();



	//Unsold cars map

	protected HashMap<Advert, Seller> unsoldCars = new HashMap<Advert, Seller>();




	//Constructor
	public Dealership(String name) {
		super();
		this.name = name; 
		
	}

	

	public String displaySoldCars() {
		String output = "SOLD CARS:\n";
		for (Advert ad : soldCars.keySet()) {
			output += "Ad:" + this.soldCars;
		}
		return output;}
	

	public String displayStatistics() {
		
		return "Statistics";
		
	}

	public String displayUnsoldCars()  {  //String to display Unsold Cars
		{
			String output = "UNSOLD CARS:\n";
			for (Advert ad : unsoldCars.keySet()) {
				output += "Ad:" + this.unsoldCars;
			}
			return output;}
		}
		
	

	public boolean placeOffer(Advert carAdvert,User user, double value) throws IllegalArgumentException {
		
		Map<Advert, Seller> display = this.carsForSale; // Map  
		boolean output = false;
		if (this.carsForSale.containsKey(display)) { // Accessing the map
			output = true;
		}
			
		if(carAdvert == null) {
			throw new IllegalArgumentException ("Invalid car advert"); // IllegalArgumentException for advert
		}
		if(user == null) {
			throw new IllegalArgumentException ("Invalid user, insert a valid user"); // IllegalArgumentException for user
		}
	
	
		return true;
		
	}
	  
	public Auctioneer registerCar( Advert carAdvert, User user, String colour, CarType type,CarBody body, int noOFSeats)throws IllegalArgumentException {
		
		//Cars.put(carAdvert,user);
	//soldCars.put(carAdvert,user);
		
		
		if(carAdvert == null) {
			throw new IllegalArgumentException ("Invalid car advert"); // illegal argument exception for the car advert
		}
		if(user == null) {
			throw new IllegalArgumentException ("Invalid user, insert a valid user"); // exception for the user
			
		}
		
		carAdvert.getCar().setBody(body); // adding elements to the map
		carAdvert.getCar().setGearbox(type);
		carAdvert.getCar().setColour(colour);
		carAdvert.getCar().setNumberOfSeats(noOFSeats);
		carsForSale.put(carAdvert, (Seller) user);
		
		return null;
		
			
			
	}



	}
	 