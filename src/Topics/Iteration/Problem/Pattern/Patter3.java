package Topics.Iteration.Problem.Pattern;

public class Patter3 {

    public static void main(String[] args) {
        int r= 5/2+1;
//        System.out.println(r);

        int n = 7;
        int trow = n;
        int star = 1;

        for(int row=1; row<=trow; row++){
            // work for current
            for(int cst=1; cst<=star;cst++){
                System.out.print(cst);
            }


            //next row
            System.out.println();

            if(row <= trow/2){
                star++;
            }else {
                star--;
            }


        }
    }
}