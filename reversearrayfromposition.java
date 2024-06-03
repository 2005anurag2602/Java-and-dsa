import java.util.Arrays;
import java.util.Scanner;

public class reversearrayfromposition
{

    public static void rotateLeft(int[] arr, int d) {
        if (arr == null || arr.length == 0 || d <= 0) {
            return;
        }
        int n = arr.length;
        d = d % n; // In case d is greater than n

        // Reverse the first part
        reverse(arr, 0, d - 1);
        // Reverse the second part
        reverse(arr, d, n - 1);
        // Reverse the whole array
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the number of positions to rotate the array to the left:");
        int d = scanner.nextInt();

        rotateLeft(arr, d);

        System.out.println("Array after rotation:");
        System.out.println(Arrays.toString(arr));

        scanner.close();
    }
}
