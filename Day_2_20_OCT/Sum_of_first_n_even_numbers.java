import java.util.Scanner;

public class Sum_of_first_n_even_numbers {
    static void main() {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("First n even numbers are : ");
        printNEvenNumbers(n);

    }

    private static void printNEvenNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= 2*n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum+=i;
            }
        }
        System.out.println("\nSum of these "+n+" even number is : "+sum);
    }
}
