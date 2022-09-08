import java.util.Scanner;
public class forLoopDemo {



    public static void main(String[] args) {
        int random= (int) (Math.random() * 100);
        System.out.println(random);

        Scanner sc= new Scanner(System.in);
        boolean flag= true;

        while(flag){
            System.out.println("Guess any number between 1 and 100: ");
            int anInt= sc.nextInt();
            if(anInt == random){
                System.out.println("You guessed it right!");
                flag= false;
            }else{
                System.out.println("Try again");
            }
        }
    }
}
