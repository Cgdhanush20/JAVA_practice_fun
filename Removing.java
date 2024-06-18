import java.util.*;
public class Removing 
{
    public static int in=0;
    public static void main(String args[])
    {
        int[] a={2,3,4,6,8,12,2,3,3,3,2,2,2};
        int val=2;
        List<Integer> l=new ArrayList<>();
        removeVal(a,val,l);
        System.out.println(Arrays.toString(l.toArray()));
        System.out.println("count:"+in);
        
    }
    public static void removeVal(int[] a,int val,List<Integer> l)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=val)
            {
                in++;
                l.add(a[i]);
            }
        }
    }
}
