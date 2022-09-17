public class EvenArray {

    public static int[] arr=  {3,2,8,1,4,7};

    public static void main(String[] args) {
        System.out.println(evenNumbers());
    }

    // count the number of even values in arr

    public static int evenNumbers() {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) count++;
        }
        return  count;
    }

}
