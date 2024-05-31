package coursework_question4;


public abstract class User {

	
	public static final String USER_REG = "[A-Z][a-z]+";
		

	protected String fullname;//full name
	
  
    //Set a condition first name with capital letter
	public  User(String fullname) throws IllegalArgumentException{
		super();
		this.fullname = fullname;

	
			int idx = fullname.lastIndexOf(' ');
			if (idx == -1)
				throw new IllegalArgumentException("First name only");
			String firstname = fullname.substring(0, idx);
			String lastName = fullname.substring(idx +1);
		if(!firstname.matches("[A-Z][a-z]+"))  {
			throw new IllegalArgumentException("Enter a valid username");
		}
		}
	
			
		//}else{
			//throw new IllegalArgumentException("Invalid username");// statement is shown if the condition stated is not met
		
	
	

	public String getName() {
		int idx = fullname.lastIndexOf(' ');
		if (idx == -1)
			throw new IllegalArgumentException("First name only");
		String firstname = fullname.substring(0, idx);
		String lastName = fullname.substring(idx +1);
		 return firstname ;
	}
	
	

	@Override
	public String toString() {
		return this.fullname;
	}


	
	

	
    
	
	
	
	
	
	
	
	

}
