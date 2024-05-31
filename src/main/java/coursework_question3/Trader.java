package coursework_question3;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import coursework_question3.Car;

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
		ArrayList<Seller> display = this.sellers; 
		boolean output = false;
		if (this.sellers.containsAll(sellers)) {
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


}
 