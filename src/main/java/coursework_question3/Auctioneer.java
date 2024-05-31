package coursework_question3;

import java.util.HashMap;
import java.util.Map;

import coursework_question3.Advert;
import coursework_question3.Car;

public class Auctioneer extends Dealership {
	
		

public Auctioneer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}






//Sales Map
private HashMap<Seller, Integer> sales = new HashMap<Seller, Integer>();

private Seller topSeller;



//boolean method
@SuppressWarnings("unused")
private boolean checkExistence(Car car) throws IllegalArgumentException { // checkExistence method
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


public Advert endSale(Advert advert) { 
	
	
	if(advert == null) {
		throw new IllegalArgumentException ("Invalid advert"); // IllegalArgumentException for advert
	}
	return advert;
	}
}







 