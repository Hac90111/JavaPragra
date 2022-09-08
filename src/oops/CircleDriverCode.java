package oops;

public class CircleDriverCode {

    public static void main(String[] args) {

        Circle circle= new Circle(); // what to create and how, 'new Circle()' is a default constructor

        circle.setRadius(2);
        System.out.println(circle.area());

    }
}
