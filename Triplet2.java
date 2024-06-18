import java.util.*;
public class Triplet2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array values:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean f=false;
        int t=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            int j=i+1,k=arr.length-1;
            while(j<k)
            {
                if(arr[i]+arr[j]+arr[k]==t)
                {
                    System.out.println("output=1");
                    System.exit(0);
                }
                if(arr[i]+arr[j]+arr[k]<t)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
        System.out.println("output=0");
    }
}