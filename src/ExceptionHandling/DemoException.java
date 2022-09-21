package ExceptionHandling;

public class DemoException {

    public static void main(String[] args) {
        checkEmployee(100);
    }

    public static boolean checkEmployee(int id){
        try{
            if(id !=100) return true;

            // Opening connection
            else throw new CustomException("Employee Id: "+id+" doesn't exists."); // throws your exception
        } catch (CustomException e){
            e.printStackTrace();
        }
        finally {
           System.out.println("Closing connection");   // it means, even if my first if statement is true, my code will run on finally without catch.
        }
        System.out.println("End");
        return false;
    }


    public static void test() throws ArithmeticException{
        System.out.println(2/0);
    }                                       // Runtime exception
}
