//program to find first non repeating character in string
import java.util.*;
public class HashSetEx2 
{
    public static void main(String[] args) 
    {
        HashSet<Character> seen=new HashSet<>();
        List<Character> chars=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        for(char c:s.toCharArray())
        {
            if(seen.contains(c))
            {
                chars.remove((Character)c);
            }
            else
            {
                seen.add(c);
                chars.add(c);
            }
        }
        for(char c:chars)
        {
            System.out.println("First non repeating character is:"+c);
            return;
        }
        System.out.println("No non repeating character");
    }
}
