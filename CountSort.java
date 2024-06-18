import java.util.*;
public class CountSort 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        countsort(a,n);
        System.out.println("Sorted array is:"+Arrays.toString(a));
    }
    public static void countsort(int a[],int n)
    {
        if(n==0) return;
        int max=a[0];
        int min=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        int range=max-min+1;
        int count[]=new int[range];
        int o[]=new int[n];
        for(int i=0;i<range;i++)
        {
            count[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            count[a[i]-min]++;
        }
        for(int i=1;i<range;i++)
        {
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--)
        {
            o[count[a[i]-min]-1]=a[i];
            count[a[i]-min]--;
        }
        for(int i=0;i<n;i++)
        {
            a[i]=o[i];
        }
    }
}
