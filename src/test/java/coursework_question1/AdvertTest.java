package coursework_question1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdvertTest {

	@Test
	public void testGetHighestOffer() {
		Offer offer = new Offer(null, 10);
		Car car   = new Car(0, null, 0, null);
	}

	@Test
	public void testAdvert() {
		Advert advert = new Advert(null);
	
	}
	
	
	
	@Test(expected = IllegalArgumentException.class)
	public void coursework_testInvalidPlaceOffer() {
		Advert.placeOffer(null, 19999.99);
	}
	@Test
	public void testPlaceOffer() {
		
		Car car = new Car(8907, "Toyota Corolla", 4000, Condition.USED);
		User seller = new User("Tia Amos");
		User buyer = new User("Fairson Soares ");

		Advert ad = new Advert(car);


		assertTrue(Advert.placeOffer(buyer, 4005));
	}

	@Test
	public void testToString() {
		Car car = new Car(2345, "Toyota Corolla", 15000, Condition.NEW);

		car.setBody(CarBody.SUPERCAR);
		car.setColour("White");
		car.setGearbox(CarType.MANUAL);
		car.setNumberOfSeats(2);

		assertEquals(                                    
				"2345 - Toyota Corolla (£15000.00)\n" + "	 Type: MANUAL\n" + "	 Style: MICRO\n"
						+ "	 Colour: Red\n" + "	 No. of Seats: 4\n" + "	 Condition: NEW", car.toString());
				



}
}
