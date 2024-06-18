import java.util.*;

public class Subarray_unsorted_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the target sum:");
        int sum = sc.nextInt();
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            int s = 0;
            for (int j = i; j < n; j++) 
            {
                s += a[j];
                if (s == sum) {
                    System.out.println((i + 1) + "," + (j + 1));
                    return;
                }
            }
        }
        System.out.println("No subarray with the given sum found.");
    }
}
