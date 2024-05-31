package coursework_question3;

public class Seller extends User {

	public Seller(String fullname) throws IllegalArgumentException {
		super(fullname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return getName() + " R. (" + ")";
		
	}
	
	

}
