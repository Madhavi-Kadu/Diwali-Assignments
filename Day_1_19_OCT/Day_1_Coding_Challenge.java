import java.util.Scanner;

public class Day_1_Coding_Challenge {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter array length");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter list of Strings:");
        for (int i = 0; i < n ; i++) {
            arr[i]=sc.next();
        }

        int maxLength = findMaxLength(arr);
        System.out.println("Length of the longest string in this array is : "+ maxLength);
    }

    private static int findMaxLength(String[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max)
                max = arr[i].length();
        }

        return max;
    }

}
