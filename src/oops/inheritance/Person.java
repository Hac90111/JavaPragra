package oops.inheritance;

import java.util.SplittableRandom;

public class Person {

    // Declaring properties
    private String firstName;
    private String lastName;
    private int sinNum;

// Getters for all the properties
    public String getFirstName(){
        return firstName;
    };

    public String getLastName(){
        return  lastName;
    };

    public int getSinNum(){
        return  sinNum;
    };

// Setter for the properties

   public void setFirstName(){
       this.firstName=firstName;
   };

   public void setLastName(String lastName){
       this.lastName= lastName;
   };

   public void setSinNum(int sinNum){
       this.sinNum= sinNum;
   };

   // Default constructor
    public Person(){};

   // Parameterized constructor
    public Person(String firstName, String lastName, int sinNum){
        this.firstName= firstName;
        this.lastName= lastName;
        this.sinNum= sinNum;
    }
};
