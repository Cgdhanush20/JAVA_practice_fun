import java.io.*;
public class PrimeNO 
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int n=Integer.parseInt(bf.readLine());
        int c=0;
        if(n<=0)
        {
            System.out.println("Not prime");
            return;
        }
        for(int i=1;i<n/2;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c!=1)
        {
            System.out.println("Not prime");
            return;
        }
        System.out.println("Prime");
    }
}
