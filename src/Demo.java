public class Demo {

    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println(summation(5,2));
        System.out.println(substraction(5,2));
        System.out.println(multiplication(5,2));
        System.out.println(division(5,2));

    }
    public static int summation(int a, int b) {
        return a + b;
    }
    public static int substraction(int a, int b) {
        return a - b;
    }
    public static int multiplication(int a, int b) {
        return a * b;
    }
    public static int division(int a, int b) {
        return a / b;
    }

}

