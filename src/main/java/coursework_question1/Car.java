package coursework_question1;

public class Car {
	
	private int ID;
	
	private String name;
	
	private String Colour;
	
	private double Price;
	
	private CarType Gearbox;
	
	private CarBody Body;
	
	private int NumberOfSeats;
	
	private Condition Condition;
	
	
	//Constructor for the class Car
	public Car(int ID, String name,  int Price, Condition Condition) throws IllegalArgumentException, NullPointerException{
		super();
		
		if(name == null) {
			throw new IllegalArgumentException ("Invalid name");
		}
		
		if(Price < 0) {
			throw new IllegalArgumentException ("Invalid price");
		}
		
		if(ID < 0) {
			throw new IllegalArgumentException ("Invalid ID");
		}
			
		this.ID = ID;
		this.name = name;
		this.Price = Price;
		this.Condition = Condition;
	}
	
	
public String displayCarSpecification() {
	
	return this.ID + " - " + this.name +" "+ "("+"£"+this.Price+"0"+")"+"\n\t Type: "+ this.Gearbox + "\n\t Style: " + this.Body +"\n\t Colour: "+ this.Colour+"\n\t No. of Seats: " + this.NumberOfSeats+"\n\t Condition: " + this.Condition;
	
	}


public int getID() {
	return ID;
}


public void setID(int ID) {
	this.ID = ID;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getColour() {
	return Colour;
}


public void setColour(String colour) {
	Colour = colour;
}


public double getPrice() {
	return Price;
}


public void setPrice(double price) {
	Price = price;
}


public CarType getGearbox() {
	return Gearbox;
}


public void setGearbox(CarType gearbox) {
	Gearbox = gearbox;
}


public CarBody getBody() {
	return Body;
}


public void setBody(CarBody body) {
	Body = body;
}


public int getNumberOfSeats() {
	return NumberOfSeats;
}


public void setNumberOfSeats(int numberOfSeats) {
	NumberOfSeats = numberOfSeats;
}


public Condition getCondition() {
	return Condition;
}


public void setCondition(Condition condition) {
	Condition = condition;
}


public CarBody getBodyStyle() {
	return this.Body;
	
	
}

@Override
public String toString() {
	return this.ID + " - " + this.name;
}
}



