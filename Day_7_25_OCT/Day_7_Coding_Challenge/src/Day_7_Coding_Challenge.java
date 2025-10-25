import java.util.Scanner;

public class Day_7_Coding_Challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String str = sc.nextLine();

        boolean isAlphanumeric = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                isAlphanumeric = false;
                break;
            }
        }
        if (isAlphanumeric) {
            System.out.println("contains only alphanumeric characters.");
        } else {
            System.out.println("contains non-alphanumeric characters.");
        }
        sc.close();
    }
}
