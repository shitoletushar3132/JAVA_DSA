package Topics.Iteration;

public class IterativeStatmentsDemo {
    public static void main(String[] args) {

        // task is to print numbers from 1 - 10;

        int sum =0;

        for(int i = 1; i<=200; i++){
            sum+=i;
//            System.out.println(i);
        }

        System.out.println(sum);

        int num = 1;
        while(num <= 10){
            System.out.println("Num : "+num);
            num++;
        }
    }
}
