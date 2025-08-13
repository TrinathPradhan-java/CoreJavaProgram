package exam;

public class SceinceStudent extends Student {

	private int math;
	private int physics;
	private int chemistry;
	public SceinceStudent(String name, int roll, int math, int physics, int chemistry) {
		super(name, roll);
		this.math = math;
		this.physics = physics;
		this.chemistry = chemistry;

		
	}
	
	
	public double calculate() {
		double totalmarks= math+physics+chemistry;
		return (totalmarks/300*100);
		
	}
	public void displayDetails() {
		
			System.out.println("name :"+name);
			System.out.println("roll :"+roll);
			System.out.println("math :  " +math+ "  physics : " +physics+ "  chemistry : "+chemistry);
			System.out.println("percentage :"+calculate());
			
		
	}

	
	
}
