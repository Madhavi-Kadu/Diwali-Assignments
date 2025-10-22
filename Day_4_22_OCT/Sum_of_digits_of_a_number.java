import java.util.Scanner;

public class Sum_of_digits_of_a_number {
    static void main() {
        System.out.println("Enter A Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sumOfDigits(num);
    }

    private static void sumOfDigits(int num) {
        int sum = 0;
        while (num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("The Sum of digits is : "+sum);
    }

}
