import java.util.*;
public class HashSetEx 
{
    public static void main(String args[])
    {
        HashSet<String> hs=new HashSet<>();
        hs.add("Java");
        hs.add("C");
        hs.add("C++");
        hs.add("Python");
        hs.add("C#");
        hs.add("C#");
        hs.add("C");
        System.out.println(hs);
        //this is for iterative printing of hashset
        Iterator<String> itr=hs.iterator(); 
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
