import java.util.*;
public class Fibonacci_Hashmap 
{
    private HashMap<Integer, Integer> hm = new HashMap<>();
    public int fib(int n) 
    {
        if (n <= 1) return n;
        if (hm.containsKey(n)) 
        {
            return hm.get(n);
        }
        int r = fib(n - 1) + fib(n - 2);
        hm.put(n,r);
        return r;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n = sc.nextInt();
        Fibonacci_Hashmap f = new Fibonacci_Hashmap();
        System.out.println("Fibonacci of " + n + " is: " + f.fib(n));
    }
}