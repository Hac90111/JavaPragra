public class DuplicateValues {

    public static int[] arr= {1,2,5,6,3,2,7,6,8};

    public static void main(String[] args) {
        findDuplicate();
    }

    public static void findDuplicate(){
        int count=0;
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]==arr[j] && i!=j){
                    count++;
                }
            }
        }
        System.out.println("You have "+count+" duplicate values");
    }
}
