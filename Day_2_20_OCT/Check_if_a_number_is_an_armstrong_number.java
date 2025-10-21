import java.util.Scanner;

public class Check_if_a_number_is_an_armstrong_number {
    static void main() {
        System.out.println("Enter the number to check : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = countOfDigits(num);
        checkArmstrong(num,count);
    }

    private static int countOfDigits(int num) {
        int count = 0;
        while (num > 0){
            num /= 10;
            count++;
        }
        return count;
    }

    private static void checkArmstrong(int num,int digits) {
        int original = num;
        int arm = 0;
        while (num > 0){
            int digit = num % 10;
            arm += Math.pow(digit, digits);
            num /= 10;
        }
        if (original == arm)
            System.out.println(original+ " is an Armstrong number");
        else
            System.out.println(original+ " is not an Armstrong number");
    }
}
