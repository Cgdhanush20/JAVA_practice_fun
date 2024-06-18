import java.util.*;
public class HashMapEx 
{
    public static void main(String args[])
    {
        HashMap<String,String> hm=new HashMap<>(3,0.75f);
        hm.put("Dhanush","R21EH117");
        hm.put("Ankith","R21EH111");
        hm.put("Chandan","R21EH118");
        hm.put("Aditi","R21EH110");
        System.out.println(hm);
        hm.put("Aditi","R21EH112");
        System.out.println("after replacing "+hm);//replaces value 
        hm.remove("Aditi");
        System.out.println("after removing "+hm);
        if(hm.containsKey("Dhanush"))
        {
            System.out.println("has key"+"Dhanush");
        }
        else{
            System.out.println("not have key Dhanush");
        }
        if(hm.containsValue("R21EH111"))
        {
            System.out.println("has key R21EH110");
        }
        else
        {
            System.out.println("not have key R21EH110");
        }
        if(hm.isEmpty())
        {
            System.out.println("Hash map is empty");
        }
        else
        {
            System.out.println("Hash map is not empty");
        }
    }
}
