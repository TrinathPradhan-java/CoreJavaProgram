package exam;

public class VehicleTest {

	public static void main(String[] args) {
		Car car = new Car("Audi", "Q8", 2021, 4);
		 
			System.out.println("invalid");
		
		
		System.out.println("\nCar Details:");
		car.displayDetails();
	
		
		Bike bike = new Bike("Yamaha", "MT-07", 2020, "Sports");
		System.out.println("\nBike Details:");
        bike.displayDetails();

	}

}
