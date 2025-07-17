import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read initial strings
        String s = sc.nextLine();  // Bob's string
        String t = sc.nextLine();  // Alice's target

        StringBuilder bob = new StringBuilder(s);
        int days = 1;

        while (true) {
            if (isSubsequence(t, bob.toString())) {
                System.out.println(days);
                break;
            }

            // Take a copy of the string at the start of the day
            StringBuilder copyOfBob = new StringBuilder(bob.toString());
            bob.append(copyOfBob.reverse()); // append the reverse of snapshot
            days++;
        }
    }

    // Check if t is a subsequence of s
    static boolean isSubsequence(String t, String s) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == t.length();
    }
}
