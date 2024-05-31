package coursework_question3;

public class Buyer extends User {
		
		private int age;
		
		public Buyer(String fullname,int age) throws IllegalArgumentException {
			super(fullname);
			
		if (age < 18) {
			throw new IllegalArgumentException("Must be 18 years old to buy");
		}
		this.age = age;
		// TODO Auto-generated constructor stub
		}


		public int getAge() {
			return age;
		}

		@Override
		public String toString() {
			return getName().substring(0,1) + "***h";
	}
	}

