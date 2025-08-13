package multiThreading.ass01_05;

public class EducationInstitute 
{

	
	
	Course courses[]; //= new Course[3];
	Offer offers[];//=new Offer[3];
	
	public EducationInstitute(Course courses[],Offer offers[])
	{
		//this.courses=courses[];
		this.courses=courses;
		this.offers=offers;
		
}
		
	
	
	public Course[] getCourses()
	{
		return courses;
	}
	
	public Offer[] getOffers()
	{
		return offers;
	}
	
	
	public void enrollmentCourses(int courseId,String studentName)
	{
		for(Course corse:courses)
		{
			if(corse.getCourse()==courseId)
			{
				System.out.println("Student "+studentName+" Enrolled in course "+corse.getCorseName());
			}
		}
		System.out.println("");
	}
	
	
}
