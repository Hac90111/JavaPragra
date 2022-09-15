package Constructors;

public class Student {
  int roll_no;
   String stu_name;

    Student(int i, String n){
        roll_no= i;
        stu_name= n;             // Parameterized constructor
    }

    public void display(){
        System.out.println(roll_no+ " "+ stu_name);
    }

    public static void main(String[] args) {

        Student s1= new Student(1, "Adi");
        Student s2= new Student(2, "Mittal");
    s1.display();
    s2.display();
    }
}
