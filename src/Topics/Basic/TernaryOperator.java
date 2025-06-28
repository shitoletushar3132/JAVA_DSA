package Topics.Basic;

public class TernaryOperator {
    // replace if else statement in certain situations
    // evaluates the test conditions and executes a block of code based on
    // the return of statment
    // condition ? exp1 : exp2;

    public static void main(String[] args) {
        int age = 12;
        String result = (age > 18) ? "adult":"teen";
        System.out.println(result);
    }
}
