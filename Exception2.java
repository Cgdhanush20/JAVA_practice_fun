import java.util.*;
public class Exception2 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter index value:");
        int n=sc.nextInt();
        int[] a={1,2,3,4,5};
        try {
            System.out.println(a[n]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bound");
        }
    }
}
