import java.util.*;
public class Area
{
    private int l,b;
    public Area(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    public int returnArea()
    {
        return l*b;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth");
        int l=sc.nextInt();
        int b=sc.nextInt();
        Area a1=new Area(l,b);
        System.out.println("Area:"+a1.returnArea());
    }
}
