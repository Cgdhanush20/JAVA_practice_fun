import java.util.*;
public class ArrayListEx 
{
    public static void main(String args[])
    {
        ArrayList<String> a=new ArrayList<>();
        int count=0;
        a.add("Dhanush");
        a.add("Ankit");
        a.add("Chandan");
        a.add("Darshan");
        a.add("Preetham");
        count=a.size();
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
        System.out.println("Total no of students:"+count);
        a.remove(4);
        System.out.println("After removing element from index 4:");
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
        count=a.size();
        System.out.println("Total no of students after remove operation:"+count);
    }
}
