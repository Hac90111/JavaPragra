package oops.inheritance;

public class Student extends Person{
    public static void main(String[] args) {
    }
    private int studentNum;
    private double marks;

    public void setStudentNum(int studentNum){
        this.studentNum= studentNum;
    }
    public void setMarks(double marks){
        this.marks= marks;
    }

    public int getStudentNum(){
        return studentNum;
    }
    public double getMarks(){
        return marks;
    }
    Student s1= new Student();
    Person p1= new Person();
}
