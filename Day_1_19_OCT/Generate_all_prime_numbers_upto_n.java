import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generate_all_prime_numbers_upto_n {

    static void main() {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }
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
