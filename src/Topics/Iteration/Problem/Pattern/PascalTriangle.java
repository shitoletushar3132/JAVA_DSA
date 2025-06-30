package Topics.Iteration.Problem.Pattern;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5; // number of rows

        for (int i = 0; i < n; i++) {
            // for spacing
            for (int s = 0; s < n - i; s++) {
                System.out.print("  ");
            }

            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", val);
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }

    }
}
