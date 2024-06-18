import java.util.*;

public class InsertionofArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number and index:");
        int q = sc.nextInt();
        int in = sc.nextInt();
        if (in < 0 || in > n) {
            System.out.println("Index out of bounds");
            return;
        }
        int[] b = new int[n + 1];
        for (int i = 0, j = 0; i < n + 1; i++) {
            if (i == in) 
            {
                b[i] = q;
            } else 
            {
                b[i] = a[j];
                j++;
            }
        }
        System.out.println("After insertion:");
        System.out.println(Arrays.toString(b));
    }
}
