package Topics.Iteration.Problem;

public class Fibonacci {

    public static void main(String [] arg){

        int n=50;
        int initialFirst = 0;
        int initialSecond=1;
        int res =0;

        System.out.println(initialFirst);
        System.out.println(initialSecond);
        for(int i=2; i<=n; i++){
            res = initialFirst + initialSecond;
            initialFirst = initialSecond;
            initialSecond=res;

            System.out.println(res);
        }

//        System.out.println(res);


    }
}
