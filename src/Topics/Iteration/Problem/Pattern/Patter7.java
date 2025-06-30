package Topics.Iteration.Problem.Pattern;

public class Patter7 {
    public static void main(String[] args) {
        int n=6;
        int trows=n;
        int stars = 2;
        int spaces =n-2;

        for(int row=1; row<=trows;row++){

            for (int cst =1; cst<=trows+5;cst++){
                if(row==1 || row==trows || cst==1 || cst==trows+5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
