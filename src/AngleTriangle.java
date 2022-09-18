import java.util.Scanner;

public class AngleTriangle {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int num= sc.nextInt();
        triangle(num);
    }

    public static void triangle(int num){

        for (int i=1; i<=num; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
