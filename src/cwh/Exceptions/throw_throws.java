package cwh.Exceptions;

class RadiusNegativeException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }
}           // Created a custom Exception

public class throw_throws {

    public static double area(int r) throws RadiusNegativeException {  // here we used "throws"
        if (r<0) throw new RadiusNegativeException();   // here we used "thow"

        double result= Math.PI*r*r;    // if r is negative, it will throw exception
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        int result= a/b;
        return result;
    }   // This method could throw an exception if b=0;

    public static void main(String[] args) {
        try{
//            int c= divide(5,0);
//            System.out.println(c);
            double a= area(5);   // you have to put it in try-catch block to handle RadiusNegativeException
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println("Divided by Zero");
        }   // try-catch method is not the best approach, make custom methods for exceptionHandling.


    }
}

// Throws-gives a symbol or sign that it might give you exception (warning sign)
// Throw-used for throwing exception
