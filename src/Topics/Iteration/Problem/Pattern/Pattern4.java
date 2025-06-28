package Topics.Iteration.Problem.Pattern;

public class Pattern4 {

/*
    *
   ***
   ****
   ***
    *

 */

    public static void main(String[] args) {
        int n = 7;
        int trow=7;
        int star = 1;
        int space=n/2;

        for(int row =1; row<=trow; row++){
            for(int csp=1; csp<=space; csp++){
                System.out.print(" ");
            }
            for(int cst=1; cst<=star;cst++){
                System.out.print("*");
            }


            System.out.println();

            if(row>n/2){
                space++;
                star-=2;
            }else{
                space--;
                star+=2;
            }

        }
    }
}
