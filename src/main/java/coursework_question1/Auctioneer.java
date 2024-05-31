package coursework_question1;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Auctioneer {
	
//data types	
protected String name;  

public Car car; // car variable


//CarsForSale map
protected Map<Advert, User> carsForSale = null;




//SoldCars Map
protected Map<Advert, User> soldCars = null;




//Unsold cars map

protected HashMap<Advert,User> unsoldCars = null;



//Constructor
public Auctioneer(String name) {
	super();
	this.name = name; 
	this.carsForSale = new HashMap<Advert, User>();
	this.soldCars = new HashMap<Advert, User>();
	this.unsoldCars = new HashMap<Advert, User>();
	
}


	
	//return " SOLD CARS:\nPurchased by"+ this.ID + "- Purchased by " + this.name + "with a successful" + Offer.value + "bid."; 

//boolean method
@SuppressWarnings("unused")
private boolean checkExistence(Car car) { // checkExistence method
	{
		Map<Advert, User> display = this.carsForSale; 
		boolean output = false;
		if (this.carsForSale.containsKey(display)) {
			output = true;
		}
		return output;
	}
	}
	
{
}

public String displaySoldCars() { //String to display Sold Cars
	
	String show = "SOLD CARS:\n";  // Variable show Type String
	for (Advert car : this.soldCars.keySet()) {         // Advert car
		show += this.displaySoldCars() + " - " + "Purchased by" + this.name +  "with a successful " + this.displaySoldCars() + "0 bid.";
	}return show;
}

public String displayStatistics() { //String to display Statistics
	
	return "Statistics";
	
}

public String displayUnsoldCars() {  //String to display Unsold Cars
	{
		String output = "UNSOLD CARS:\n";
		for (Advert car : unsoldCars.keySet()) {
			output += "Ad:" + this.unsoldCars;
		}
		return output;}
	}
	

	


public void endSale(Advert advert)throws IllegalArgumentException { 
	
	if(advert == null) {
		throw new IllegalArgumentException ("Invalid advert"); // IllegalArgumentException for advert
	}
	
	return;
		
	}
	
	
	

public boolean placeOffer(Advert carAdvert,User user, double value) throws IllegalArgumentException {
	
	Map<Advert, User> display = this.carsForSale; // Map  
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
	carsForSale.put(carAdvert, user);
	
	return null;
	
		
		
}



}
 