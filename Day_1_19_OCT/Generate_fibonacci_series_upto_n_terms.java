import java.util.Scanner;

public class Generate_fibonacci_series_upto_n_terms {
    static void main() {
        System.out.println("Please enter the number of terms in series");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nTermFibonacci(n);
    }

    private static void nTermFibonacci(int n) {
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i = 2; i < n; i++) {
            int c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}
