public class MiddleChar {


    public static void main(String[] args) {
        System.out.println(middleChar("Hello sweeti ji, how are youdoing in these fine days!!!!"));
       };

    public static String middleChar(String str){
        int position;
        String substring;

        if (str.length()%2==0){
            position= str.length()/2;
            substring= String.valueOf(str.charAt(position));
        }else {
            position= str.length()/2 -1;
            substring= str.substring(position, position+2);
        }
        return substring;
    }
}
