import java.util.Scanner;

 public class CountDigits {
    // Function to count the number
    // of digits in an integer 'n'.
    public static int countDigits(int n) {
        // Initialize a counter variable
        // 'cnt' to store the count of digits.
        if (n == 0) return 1;      // special case
        n = Math.abs(n);          // handle negative numbers
        int cnt = 0;
        // While loop iterates until 'n'
        // becomes 0 (no more digits left).
        while (n > 0) {
            // Increment the counter
            // for each digit encountered.
            cnt++;
            // Divide 'n' by 10 to
            // remove the last digit.
            n /= 10;
        }
        // Return the
        // count of digits.
        return cnt;
    }

    public static void main(String[] args) {
        //int N = 329823;
        try (Scanner sc = new Scanner(System.in)) {
            //int N = 329823;
            System.out.println("Enter the number :");
            // System.out.println("N: " + N);
            System.out.println("Waiting for input...");
            int N = sc.nextInt();
            int digits = countDigits(N);
            System.out.println("Number of Digits in N: " + digits);
        }
    }
}
