package multiThreading.ass01_05;

public class Student 
{
String name;
EducationInstitute institute;



public Student(String name,EducationInstitute institute)
{
	this.name= name;
	//new EducationalInstitute();
	this.institute=institute;
}
public void viewCoursesAndFees() {
	synchronized(institute)
	{
    System.out.println("\nAvailable Courses:");
    for (Course course : institute.getCourses()) {
        System.out.println(course);
    }
	}
}

public void viewOffers() {
	synchronized(institute) {
    System.out.println("\nOngoing Offers:");
    for (Offer offer : institute.getOffers()) {
        System.out.println(offer.getOffer());
    }
	}
}


public void enrollCourse(int courseId)
{
	synchronized(institute) {
	institute.enrollmentCourses(courseId, name);
	}
}
}
