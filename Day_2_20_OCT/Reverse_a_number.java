import java.util.Scanner;

public class Reverse_a_number {
    static void main() {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverseDigits(num));
    }
    private static int reverseDigits(int num) {
        int rev = 0;
        while (num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }
}
