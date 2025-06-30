package Topics.Functions;

public class FunctionsDemo {

     void sayHello(){
        System.out.println("hello guys!!!");
         System.out.println("hello guys!!!");
         System.out.println("hello guys!!!");
         System.out.println("hello guys!!!");
         System.out.println("hello guys!!!");
    }


    //In java, two or more methods may have the same name if they differ in parameters
    // (different no of parameters, different types of parameters, or both).
    // These methods are called overloaded methods and this feature is called method overloading

    // Method overloading is not associated with return types.
    // overloaded methods may have the same or different return types, but
    // they must differ in parameters

    private  static String formatNumber(int value){
         return String.format("%d",value);
    }

    private static String formatNumber(double value){
         return String.format("%.3f",value);
    }

    private static String formatNumber(String value){
        return String.format("%.2f",Double.parseDouble(value));
    }


//    public static boolean isArmstrong(int n){
//
//    }
//
//
//    public static int countDigits(int n){
//
//    }


    public static void main(String[] args) {


    }
}
