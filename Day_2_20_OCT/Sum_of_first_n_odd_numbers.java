import java.util.Scanner;

public class Sum_of_first_n_odd_numbers {
    static void main() {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("First n odd numbers are : ");
        printNOddNumbers(n);

    }

    private static void printNOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= 2*n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum+=i;
            }
        }
        System.out.println("\nSum of these "+n+" odd number is : "+sum);
    }
}
