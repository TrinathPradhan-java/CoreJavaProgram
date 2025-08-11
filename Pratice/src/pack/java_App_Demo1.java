package pack;
//
//
//
//class Employee
//{
//	String name;
//	int id;
//	
//public Employee(String name,int id)
//{
//	this.name= name;
//	this.id= id;
//	
//}
//
//public String getName() {
//	return name;
//}
//
//public void setName(String name) {
//	this.name = name;
//}
//
//public int getId() {
//	return id;
//}
//
//public void setId(int id) {
//	this.id = id;
//}
//
//@Override
//public String toString() {
//	return "Employee [name=" + name + ", id=" + id + "]";
//}
//
//}




record Employee1(String name,int id){}
public class java_App_Demo1 
{
public static void main(String[] args) {
//	Employee emp = new Employee("Tsdn",111);
//	System.out.println(emp);
//	emp.setName("Ravi");
//	System.out.println(emp.getName());
	
	
	Employee1 emp1 = new Employee1("Trinath",101);
	System.out.println(emp1);
	
	Employee1 emp2 = new Employee1("Wien",191);
	System.out.println(emp2);
	//System.out.println(emp1.getName());
}
}
