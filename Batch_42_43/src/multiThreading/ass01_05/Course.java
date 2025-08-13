package multiThreading.ass01_05;

public class Course 
{
int courseId ;
String courseName;
double corseFee;

public Course(int courseId,String courseName,double corseFee)
{
	this.courseId = courseId;
	this.courseName=courseName;
	this.corseFee=corseFee;
	
}
public int getCourse()
{
	return courseId;
}
public String getCorseName()
{
	return courseName;
}
public double getCourseFee()
{
	return corseFee;
}
@Override
public String toString() {
	return "Course [courseId=" + courseId + ", courseName=" + courseName + ", corseFee=" + corseFee + "]";
}


}
