package Topics.Iteration.Problem.Pattern;

public class Pattern5 {

    public static void main(String [] arg){

        int n=10;
        int trows=n;
        int stars =n;
        int spaces=1;


        for(int cst=1; cst<= 2*n-1; cst++){
            System.out.print("*");
        }

        System.out.println();

        for(int row = 1; row<trows; row++){
            for(int cst=1; cst<=trows-row; cst++){
                System.out.print("*");

            }

            for(int csp = 1; csp<=spaces; csp++){
                System.out.print(" ");
            }
            for(int cst=1; cst<=trows-row; cst++){
                System.out.print("*");

            }
            System.out.println("");
            spaces+=2;
        }

    }
}
