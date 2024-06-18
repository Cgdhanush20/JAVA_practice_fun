import java.util.*;
public class CheckAllAlphabet 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        s=s.toLowerCase();
        HashSet<Character> set=new HashSet<>();
        for(char c:s.toCharArray())
        {
            if(c>='a' && c<='z')
            {
                set.add(c);
            }
        }
        if(set.size()==26)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }
}
