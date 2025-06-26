package Topics.problem;

import java.util.Scanner;

public class ValidTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Three angles of Triangle : ");

        int firstAngle = sc.nextInt();
        int secondAngle = sc.nextInt();
        int thirdAngle = sc.nextInt();

        int sum = firstAngle+secondAngle+thirdAngle;

        if(( sum==180)&& (firstAngle>0 && secondAngle>0 && thirdAngle>0 ) ){
            System.out.println("Valid Triangle");

        }else{
            System.out.println("Invalid Triangle ");
        }

    }
}
