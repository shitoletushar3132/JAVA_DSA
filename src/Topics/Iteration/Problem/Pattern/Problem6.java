package Topics.Iteration.Problem.Pattern;

public class Problem6 {

    public static void main(String[] args) {
        int n=69;
        int trows=n;
        int spaces = n-2;
        int stars=1;

        for(int row=1; row<=trows; row++){
            for(int cst=1; cst<=stars; cst++){
                System.out.print("*");
            }

            for(int csp=1; csp<=spaces; csp++){
                System.out.print(" ");
            }

            int sstars=stars;

            if(row==trows/2+1){
                sstars=stars-1;
            }
            for(int cst=1; cst<=sstars; cst++){
                System.out.print("*");
            }

            System.out.println();

            if(row<=trows/2){
                stars++;
                spaces-=2;
            }else{
                stars--;
                spaces+=2;
            }

        }


    }
}
