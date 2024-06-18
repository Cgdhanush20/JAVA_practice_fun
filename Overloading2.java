public class Overloading2 
{
    public int min(int a,int b)
    {
        return Math.min(a, b);
    }
    public double min(double a,double b)
    {
        return Math.min(a,b);
    }
    public static void main(String aa[])
    {
        Overloading2 o=new Overloading2();
        System.out.println(o.min(1,2));
        System.out.println(o.min(2.3,4.5));
    }
}
