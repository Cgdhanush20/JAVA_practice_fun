public class Overloading1 
{
    public int sum(int a,int b)
    {
        return a+b;
    }
    public int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public double sum(double a,double b)
    {
        return a+b;
    }
    public static void main(String aa[])
    {
        Overloading1 o=new Overloading1();
        System.out.println(o.sum(1,2));
        System.out.println(o.sum(1,2,3));
        System.out.println(o.sum(1.2,3.4));
    }
}
