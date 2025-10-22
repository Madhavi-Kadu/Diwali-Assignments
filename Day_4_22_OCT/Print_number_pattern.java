import java.util.Scanner;

public class Print_number_pattern {
    static void main() {
        System.out.println("Enter number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        triangleMaker(n);
        pyramidMaker(n);
    }

    private static void triangleMaker(int n) {
        System.out.println("\nTriangle Pattern");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void pyramidMaker(int n) {
        System.out.println("\n\nPyramid Pattern");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
