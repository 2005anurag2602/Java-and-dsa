// Import the necessary Java class.
import java.util.Arrays;
import java.util.Scanner;
class Simpul
{
    private static void swap(int[] nums, int i, int j) {
        int number = nums[i];
        nums[i] = nums[j];
        nums[j] = number;
    }
    public static void rearrange(int[] arr)
    {
        for (int i = 1; i < arr.length; i += 2)
        {
            if (arr[i - 1] > arr[i]) {
                swap(arr, i - 1, i);
            }
           if (i + 1 < arr.length && arr[i + 1] > arr[i]) {
               swap(arr, i + 1, i);
           }
        }
    }
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rearrange(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
