import java.util.Scanner;
public class AlternatingSubarray 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }
        int maxLen = 1;
        int currentLen = 1;
        for (int i = 1; i < arr.length; i++)
        {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) 
            {
                currentLen++;
                maxLen = Math.max(maxLen, currentLen);
            } else 
            {
                currentLen = 1;
            }
        }
        System.out.println("Maximum length of alternating subarray: " + maxLen);
    }
}