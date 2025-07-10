package Topics.Strings;

public class Palindrome {
    public static void main(String[] args) {
        String name = "nman";
        int i = 0;
        int j = name.length() - 1;
        boolean isPalindrome = true;  // ✅ Flag to track status

        while (i <= j) {
            if (name.charAt(i) != name.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}
