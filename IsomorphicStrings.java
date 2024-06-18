import java.util.*;
public class IsomorphicStrings 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings:");
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a.length()!=b.length())
        {
            System.out.println("Not isomorphic");
            return;
        }
        HashMap<Character,Character> m=new HashMap<>();
        for(int i=0;i<a.length();i++)
        {
            if (m.containsKey(a.charAt(i))) 
            {
                if (m.get(a.charAt(i)) != b.charAt(i)) 
                {
                    System.out.println("Not isomorphic");
                    return;
                }
            }
            else 
            {
                if (m.containsValue(b.charAt(i))) 
                {
                    System.out.println("Not isomorphic");
                    return;
                }
            }
             m.put(a.charAt(i),b.charAt(i));

        }
        System.out.println("Isomorphic");
    }
}
