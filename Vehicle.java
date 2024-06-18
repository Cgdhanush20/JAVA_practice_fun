class Sportscar
{
    public void a()
    {
         System.out.println("hi");
    }
}
class Car extends Sportscar{
    public void b()
    {
        System.out.println("hello");
    }
}
public class Vehicle extends Car
{
    public void c()
    {
        System.out.println("Dhanush");
    }
    public static void main(String args[])
    {
        Vehicle v=new Vehicle();
        v.a();
        v.b();
        v.c();
    }
}
