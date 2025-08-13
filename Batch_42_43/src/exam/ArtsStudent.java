package exam;

public class ArtsStudent extends Student {

	private int history;
	private int geography;
	private int english;
	public ArtsStudent(String name,int roll,int history, int geography, int english) {
		super(name,roll);
		this.history = history;
		this.geography = geography;
		this.english = english;
	}
	public double calculate() {
		double totalmarks= history+geography+english;
		return (totalmarks/300*100);
		
	}
	public void displayDetails() {
		
		System.out.println("name :"+name);
		System.out.println("roll :"+roll);
		System.out.println("history :" +history+ "geography :" +geography+ "english :"+english);
		System.out.println("percentage :"+calculate());
		
	
}
	
}
