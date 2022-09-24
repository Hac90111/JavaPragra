package cwh.Abstraction;

public class Child2 extends Parent2 {

    @Override
    public void greet() {
        System.out.println("Good morning");
    } // it has to be implemented in its child class

}


/* For example,
 Abstract class is a standard and all of its children classes have to implement those standards.
 it's like a compulsory declaration, but different for different child.
 ex, every child has to eat food, but every child has different food (concept of overriding). So here, the standard set by parent class is
 public abstract void eatFood();
 */

// You cannot create objects of an abstract class. because it's a standard for other children class to be declared
