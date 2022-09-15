public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private int age;

    // Method to get full Name
    public String getFullName(){
        return (firstName+" "+lastName);
    }

    // Constructor to create a person
    public Person(){}

    // method to change the address
    public String changeAddress(String address){
        return this.address= address;
    }

    // getter to return the address
    public String getAddress() {
        return address;
    }
}
