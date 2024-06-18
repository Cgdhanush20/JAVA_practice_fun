import java.util.*;
public class Twosum 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter target:");
        int t=sc.nextInt();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int c=t-a[i];
            if(hm.containsKey(a[i]))
            {
                System.out.println("Indices: " + hm.get(a[i]) + " and " + i);
                return;
            }
            hm.put(c, i);
        }
    }
}
