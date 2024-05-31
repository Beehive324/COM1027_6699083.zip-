package coursework_question4;

public class Seller extends User {
	
	
	private int sales;
	
	public Seller(String fullname) throws IllegalArgumentException {
		super(fullname);
		this.sales = sales;
	}
	
	
	public String identifyRating() {
		
		if(sales == 0) {
			return "Sales: 0, Rating: Level 0";
		}
		if(sales >= 1) {
			return "Sales: 1, Rating: Level 0";
		}
		if(sales <= 5) {
			return "Sales: 5, Rating: Level 1";
		}
		if(sales <= 6) {
			return "Sales: 6, Rating: Level 2";
		}
		if(sales  <=10) {
			return "Sales: 10, Rating: Level 2";
		}
		if(sales >=10) {
			return "Sales: 20, Rating: Level 3";
			
			
			
		}
		return null;
		}
		
		

	@Override
	public String toString() {
		return getName() + " R. (" + identifyRating() + ")";
	
	}
	
	

}
