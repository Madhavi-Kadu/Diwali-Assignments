import java.util.Scanner;

public class Print_multiplication_table_of_a_number {
    static void main() {
        System.out.println("Multiplication Table : ");
        System.out.println("Enter Number who's Table you want to print : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        multiplyTable(n);
    }

    private static void multiplyTable(int n) {
        for (int i = 1; i < 11; i++)
        System.out.println(n+" x "+i+" = "+(n*i));
    }
}
