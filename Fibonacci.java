import java.util.*;
public class Fibonacci 
{
    private long[] memo;
    public Fibonacci(int n)
    {
        this.memo=new long[n+1];
        for(int i=0;i<=n;i++)
        {
            memo[i]=-1;
        }
    }
    public long fibonacci(int n)
    {
        if(n<=1) return n;
        if(memo[n]!=-1) return memo[n];
        memo[n]=fibonacci(n-1)+fibonacci(n-2);
        return memo[n];
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        Fibonacci fib=new Fibonacci(n);
        System.out.println("Fibonacci of "+n+" is: "+fib.fibonacci(n));
    }

    String fib(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
