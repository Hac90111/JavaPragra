import oops.inheritance.Person;

public class Student extends Person {

    // Properties
    private int studentNum;
    private double marks;

    // Getters for properties
    public int getStudentNum() {
        return studentNum;
    }

    public double getMarks() {
        return marks;
    }

    //setters for properties
    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    //Default constructor
    public Student(){};

    // Parameterized constructor
    public Student(int studentNum, double marks) {
        this.studentNum = studentNum;
        this.marks = marks;
    }

    // psvm method to perform operations

    public static void main(String[] args) {
        Student s1= new Student();
        Person p1= new Person();
    }
}
