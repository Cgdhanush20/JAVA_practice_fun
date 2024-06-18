import java.util.*;
public class Subarray_unsorted_sum_optimized {
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
        Map<Integer, Integer> map = new HashMap<>();
        int cumulativeSum = 0;
        for (int i = 0; i < n; i++) {
            cumulativeSum += a[i];
            if (cumulativeSum == sum) 
            {
                System.out.println("1," + (i + 1));
                return;
            }
            if (map.containsKey(cumulativeSum - sum)) 
            {
                System.out.println((map.get(cumulativeSum - sum) + 2) + "," + (i + 1));
                return;
            }
            map.put(cumulativeSum, i);
        }
        System.out.println("No subarray with the given sum found.");
    }
}
