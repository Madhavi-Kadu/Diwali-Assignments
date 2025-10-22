import java.util.Scanner;

public class Find_GCD_and_LCM_of_two_numbers {
    static void main() {
        System.out.println("Enter two numbers :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int GCD = findGCD(a,b);
        System.out.println("GCD of "+a+" and "+b+" is : "+GCD);
        findLCM(a,b);
    }

    private static int findGCD(int a, int b) {
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static void findLCM(int a, int b) {
        int LCM = (a*b) / findGCD(a,b);
        System.out.println("LCM of "+a+" and "+b+" is : "+LCM);
    }
}
