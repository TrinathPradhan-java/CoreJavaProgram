package exam;

public class Bike extends Vehicle {
	protected String type;

	public Bike(String make, String model, int year, String type) {
		super(make, model, year);
		this.type = type;
	}
	
	public void displayDetails(){
        System.out.println("Make "+make);
        System.out.println("Model "+model);
        System.out.println("Year "+year);
        System.out.println("type "+type);
    }
   
    }


