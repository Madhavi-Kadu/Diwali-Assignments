import java.util.Scanner;

public class Day_4_Coding_Challenge {
    static void main() {
        System.out.println("Enter length of Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The missing number in provided array is "+missingNum(arr));
    }
// 1 2 3 5 6 7 8 9
    private static int missingNum(int[] arr) {
        int j = 0;
        for (int i = arr[0]; i <= arr[arr.length-1]; i++) {
            if (i != arr[j]){
                return i;
            }
            j++;
        }
        return 0;
    }
}
