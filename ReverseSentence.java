import java.util.*;
public class ReverseSentence 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s=sc.nextLine();
        Stack<String> st=new Stack<>();
        int count=0;
        int i=0;
        if(s.length()==0) return;
        else if(s.length()==1)
        {
            System.out.println(s); 
            return;
        }
        while(i<s.length())
        {
            if(s.charAt(i)==' ')
            {
                String s2=s.substring(count, i);
                st.add(s2);
                count=i+1;
            }
            i++;
        }
        String s2=s.substring(count,i);
        st.add(s2);
        while(!st.isEmpty())
        {
            System.out.print(st.pop());
            if(!st.isEmpty())
            {
                System.out.print(" ");
            }
        }
    }
}
