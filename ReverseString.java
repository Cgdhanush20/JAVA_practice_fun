import java.util.*;
public class ReverseString 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        System.out.println("Enter a string of array:");
        StringBuilder s=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            s.append(sc.next().charAt(0));
        }
        s.reverse();
        System.out.println("Reversed:"+s);
    }
}
