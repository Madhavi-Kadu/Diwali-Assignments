import java.util.Scanner;

public class Calculate_factorial_of_a_number {
    static void main() {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial is "+ fact);
    }
}
