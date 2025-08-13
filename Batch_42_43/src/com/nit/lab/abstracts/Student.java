package com.nit.lab.abstracts;


public abstract class Student
{
	protected String studentName;
	protected String studentClass;
	protected static int totalNoOfStudent=0;
	
	public Student() {
		super();
	}
	public Student(String studentName, String studentClass) 
	{
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
	    totalNoOfStudent++;
	}
	
	public abstract int  getPercentage();
	public static int  getTotalNuoStudent()
	{
		return totalNoOfStudent;
	}
}
///====================
class ScienceStudent extends Student
{
	private int physicMark;
	private int chemestryMark;
	private int mathMark;
	
	public ScienceStudent( String studentName,String studentClass ,int physicMark, int chemestryMark, int mathMark) {
		super(studentName,studentClass);
		this.physicMark = physicMark;
		this.chemestryMark = chemestryMark;
		this.mathMark = mathMark;
	}
	@Override
	public  int  getPercentage()
	{
		int total = physicMark+chemestryMark+mathMark;
		
		return (total*100)/300;
	}
}


//==========================
class HistoryStudent extends Student
{
	private int historyMarks;
	private int civilsMarks ;
	public HistoryStudent(String studentName,String studentClass, int  historyMarks, int civilsMarks)
	{
		super(studentName,studentClass);
		this.historyMarks = historyMarks;
		this.civilsMarks = civilsMarks;
	}

	@Override
	public int getPercentage()
	{
		int total = historyMarks+civilsMarks;
		
		return ( total  * 100)/200;
	}
}
