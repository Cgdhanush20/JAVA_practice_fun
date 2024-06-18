import java.util.*;
public class Array_insert_at_end 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int[] a=new int[n+1];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter new element to be inserted:");
        int e=sc.nextInt();
        a[n]=e;
        System.out.println(Arrays.toString(a));
    }
}