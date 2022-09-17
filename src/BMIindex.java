import java.util.Scanner;

public class BMIindex{

    public static void main(String[] args) {
        System.out.println(getBmi());
    }

public static String getBmi(){
    System.out.println("Your weight in kg: ");
    Scanner sc= new Scanner(System.in);
    double weight= sc.nextDouble();

    System.out.println("Your height in m: ");
    double height= sc.nextDouble();
    double calculatedBmi= weight/ Math.pow(height,2);

    return "Your BMI is "+ calculatedBmi+".";
}
}
