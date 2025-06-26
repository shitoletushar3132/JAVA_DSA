package Topics.Basic.problem;

public class LeapYear {

    public static void main(String[] args) {
        int year = 2014;


        // A year is a considered a leap year
        // If year is exactly divisible by 4 and not divisible by 100 or
        // If year is divisible by 400
        // then it is a leap year

        if((year%4 == 0 && year%100 != 0) || (year %400 == 0)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not Leap Year");
        }
    }
}
