class Rectangle
{
    public int calculateArea(int l,int b)
    {
        return l*b;
    }
}
class Circle extends Rectangle
{
    public double calculateArea(double r)
    {
        return 3.14*r*r;
    }
}
public class Shape extends Circle
{
    public static void main(String args[])
    {
        Rectangle r=new Rectangle();
        Circle c=new Circle();
        System.out.println(r.calculateArea(2,4));
        System.out.println(c.calculateArea(3.09));
    }
}