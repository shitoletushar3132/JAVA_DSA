package Topics.Iteration.Problem;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 100;
        boolean isNotPrime = false;

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                isNotPrime = true;
                break;
            }
        }

        if (!isNotPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }
    }
}
