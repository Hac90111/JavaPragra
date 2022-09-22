package oops.inheritance;

public class Person {
    private String firstName;
    private String lastName;
    private int sinNum;

    // Setters for those properties
    public void setFirstName(String fName){
        this.firstName= fName;
    }
    public void setLastName(String lName){
        this.lastName=lName;
    }
    public  void setSinNum(int num){
        this.sinNum= num;
    }

    // Getters for those properties
    public String getFirstName(){
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getSinNum() {
        return sinNum;
    }
}
