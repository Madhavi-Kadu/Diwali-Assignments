import java.util.Scanner;

public class Check_If_a_number_is_prime {

    // Given Input integer n
    // Output True if prime, False otherwise

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        System.out.println(isPrime(n));

    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
                return false;
            }
        }
    return true;
    }
}
