import java.util.Scanner;

public class Check_if_a_number_is_even_or_odd {
    static void main() {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenOddChecker(n);
    }

    private static void evenOddChecker(int n) {
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
