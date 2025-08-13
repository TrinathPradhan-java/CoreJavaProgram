package pratice.pratice2;

class Student {
    private String name;
    private int id;
    private String course;
    private double fee;
    private char grade;
    private double average;

    // Parameterized Constructor
    public Student(String name, int id, String course, double fee) {
        this.name = name;
        this.id = id;
        this.course = course;
        this.fee = fee;
    }

    // Copy Constructor
    public Student(Student other) {
        this.name = other.name;
        this.id = other.id;
        this.course = other.course;
        this.fee = other.fee;
        this.average = other.average;
        this.grade = other.grade;
    }

    // Method to set average and calculate grade
    public void setAverage(double average) {
        this.average = average;
        this.grade = calculateGrade();
    }

    // Method to calculate grade
    public char calculateGrade() {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to display student details
    public void displayStudent() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Course: " + course);
        System.out.println("Fee: " + fee);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}