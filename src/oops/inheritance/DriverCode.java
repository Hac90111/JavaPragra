package oops.inheritance;

public class DriverCode {

     public static void main(String[] args) {

//        Animal animal= new Animal();  // parent object
   //     Dog dog= new Dog(); // Tight coupling, child object
//        Cat cat= new Cat();
     Animal dogie= new Dog();  // reference variable(Animal) can also hold child(Dog) objects. Loose coupling(Mostly used)
                // you can only invoke Animal's method, not Dog's one.
// To apply makeSound() method to all the children, automatically... put all animals in Animal array and apply method via forLoop
        Animal[] arr= new Animal[3];
        arr[0]= new Animal();
        arr[1]= new Dog();
        arr[2]= new Cat();

        for (int i=0; i<arr.length; i++){
            arr[i].makeSound();
        }

        // to access the child's non-inherited methods... use Type Casting

        ((Dog)dogie).test(); // using Dog object's method. they are not inherited from Animal class



    }
}

class Animal{
    public void makeSound(){
        System.out.println("Make sound animal");
    }
};
class Dog extends Animal{

    // Overriding the parent's method
    public void makeSound(){
        System.out.println("Dog is barking");
    }
    public void test(){
        System.out.println("This is not inherited method in dog class");
    }
}; // here Dog will inherit the behaviour of Animal class too.

class Cat extends Animal{
    public void makeSound(){
        System.out.println("your cat is making cute sound!");
    }
};
