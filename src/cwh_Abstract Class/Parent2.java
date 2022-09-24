package cwh;

public abstract class Parent2 {
    public Parent2() {
        System.out.println("I am Base2's constructor!");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();  // it's declared, but not implemented.
}

