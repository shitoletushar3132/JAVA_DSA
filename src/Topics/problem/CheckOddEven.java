package Topics.problem;

import java.util.Scanner;

public class CheckOddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number : ");

        int number = sc.nextInt();

        if(number % 2==0){
            System.out.println("it is even");
        }else {
            System.out.println("It is odd");
        }
    }
}
