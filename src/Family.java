public class Family {

    public String fatherName;
    public String motherName;
    public String sonName;
    public String daughterName;

    private double fatherSalary;
    private double motherSalary;
    private double sonFee;
    private double daughterFee;
    public static int grocery= 500;

// constructor to create a family
    public Family(String fatherName, String motherName, String sonName, String daughterName) {
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.sonName = sonName;
        this.daughterName = daughterName;
    }
 // method to display names

 public void displayNames(){
     System.out.println(fatherName);
     System.out.println(motherName);
     System.out.println(sonName);
     System.out.println(daughterName);
 }

 // Total salary

    public double getTotalSalary(){
        return fatherSalary+motherSalary;
    }

    // total fees
    public double getTotalFee(){
        return sonFee+daughterFee;
    }

    // Total savings

    public String getSavings(){
        double savings= getTotalSalary()-getTotalFee()-grocery;
        String s1;
        if(savings>1000) s1 = "Congratulation! " + fatherName + "you saved this much= " + savings + ".";
        else  s1 = "Dear " + fatherName + "! Please try to save for next month.";
        return s1;
    }
}
