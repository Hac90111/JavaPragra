import java.util.Scanner;

public class MultiTable {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input the number (Table to be calculated): ");
        int num= sc.nextInt();
        System.out.println("Input number of terms:");
        int terms= sc.nextInt();
        multiply(num, terms);
    }

    public static void multiply(int num, int terms) {

        int multi = 0;
        for (int i = 1; i <= terms; i++) {
            multi= num*i;
            System.out.println(num+ " X "+ i+" = "+ multi);
        }
    }
}
