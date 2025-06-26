package Topics.Iteration.Problem;

public class ReverseNumber {

    public static void main(String[] args) {
        int num=56693;

        int reverse=0 ;

        while(num != 0){
            reverse*=10;
            reverse = reverse +(num%10);
            num = num/10;
        }

        System.out.println(reverse);
    }
}
