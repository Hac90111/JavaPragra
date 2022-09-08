package oops;

// Circle object to find area and circumference

public class Circle {

    private double radius;
    private final float pi= 3.14f;


    // getter to get the radius
    public double getRadius() {
        return radius;
    };

    // setter to set the radius
    public void setRadius(double radius) {
        this.radius = radius;
    };

    // methods to find area and circumference
    public double area(){
        return (pi * radius*radius);
    };

    public  double circumference(){
       return (2*pi*radius);
    }

}
