import java.util.Scanner;

public class Addition_of_two_numbers {
    static void main() {
        System.out.println("Please enter two numbers to add");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = addTwoNumber(a,b);
        System.out.println("Addition of "+a+" and "+b+" is : "+sum);

    }

    private static int addTwoNumber(int a, int b) {
        return a+b;
    }
}
