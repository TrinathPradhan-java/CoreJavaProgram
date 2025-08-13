package multiThreading.ass01_05;

public class University {

	public static void main(String[] args) 
	{
		
		
		Course course[]= {new Course(1,"Mathematic",1900),new Course(2,"Science",2500),new Course(3,"Chemistr",1200)};
		Offer offer[]= {new Offer("Special discount: Get 20% off on all courses!"),new Offer("Limited time offer: Enroll in any two courses and get one course free!")};

		EducationInstitute institute= new EducationInstitute(course,offer);
		Student s1 = new Student("Virat",institute);
		Student s2 = new Student("Rohit",institute);
		
		Thread thread =new Thread(()->
            {
	       s1.viewCoursesAndFees();
	       s1.viewOffers();
	       s1.enrollCourse(1);
             });
		
		Thread thread2 = new Thread(()-> 
		{
		s2.viewCoursesAndFees()	;
		s2.viewOffers()
;
		s2.enrollCourse(2);
		});
	
	thread.start();
	thread2.start();
	
	}
	

}
