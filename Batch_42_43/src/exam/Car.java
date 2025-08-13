package exam;

public class Car extends Vehicle
{
	protected int numberOfDoors;
	public Car(String make, String model, int year,int numberOfDoors) {
		super(make, model, year);
		this.numberOfDoors = numberOfDoors;
	}
	public void displayDetails(){
        System.out.println("Make "+make);
        System.out.println("Model "+model);
        System.out.println("Year "+year);
        System.out.println("Number of Doors "+numberOfDoors);
    }

}
