package coursework_question4;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Trader extends Dealership {
	
		
public Trader(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

//data types	
protected String name; 


//CarsForSale map
private ArrayList<Seller> sellers = new ArrayList<Seller>();



//boolean method
private boolean checkExistence(Car car) { // checkExistence method
	{
		List<Seller> sellers = this.sellers; 
		boolean output = false;
		if (this.carsForSale.containsKey(sellers)) {
			output = true;
		}
		return output;
	}
	}
	
{
}


public Auctioneer endSale(Advert advert) {
	return null;
	
}


@Override
public String displaySoldCars() {
	// TODO Auto-generated method stub
	return null;
}






}
 