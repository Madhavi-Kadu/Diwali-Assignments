import java.util.Scanner;

public class Check_if_a_number_is_a_palindrome {
    static void main() {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = reverseDigits(num);
        checkPalindrome(reverse,num);
    }

    private static void checkPalindrome(int reverse, int original) {
        if (reverse == original)
            System.out.println(original+" this is a Palindrome");
        else
            System.out.println(original+ " this is not a Palindrome");
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
