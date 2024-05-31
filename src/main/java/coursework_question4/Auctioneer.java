package coursework_question4;

import java.util.ArrayList;


import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Auctioneer extends Dealership {
	
		

public Auctioneer (String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}






//Sales Map
private HashMap<Seller, Integer> sales = new HashMap<Seller, Integer>();

private Seller topSeller;



//boolean method
private boolean checkExistence(Car car) { // checkExistence method
	{
		Map<Seller, Integer> display = this.sales; 
		boolean output = false;
		if (this.sales.containsKey(display)) {
			output = true;
		}
		return output;
	}
	}
	
{
}

//Advert endSale
public Advert endSale(Advert advert)throws IllegalArgumentException { 
	
	if(advert == null) {
		throw new IllegalArgumentException ("Invalid advert"); // IllegalArgumentException for advert
	}
	return advert;
	}
	


public Auctioneer updateStatistics(Seller seller) {
	return null;
	
}




@Override
public String displaySoldCars() {
	// TODO Auto-generated method stub
	return null;
}


}

 