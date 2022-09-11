public class ArraysDemo {

    public static void main(String[] args) {

        //printing array indexes
        int arr[]= new int[6];
        for(int i=0; i<arr.length; i++){
            arr[i]= i+1;
          // System.out.println(arr[i]);
        };

// Char array and printing name
        char nameArray[]= {'H','I','M','A','N','S','H','U'};
        int len= nameArray.length;

        for (int i=0; i<len; i++){
            String sum = "";
            sum= sum+ nameArray[i];
            //System.out.print(sum);
        }


        // 2D arrays

        int array2D[][]= new int[5][3];    //here rows=5, column=6

        //Strings

        String str1= new String("Hello");
        String str2="Hello";
        String str3= "Hello";

        if(str3.equals(str2)){
            System.out.println("str3.equals(str2) "+ "true");
        }else{
            System.out.println("str3.equals(str2) "+ "false");
        }

           /* Methods of String class
              equals(),contains(),indexOf(),charAt(),toCharArray(),subString(), replace()... */

    }


}
