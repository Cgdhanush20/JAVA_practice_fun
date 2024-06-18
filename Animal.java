class Dog 
{
    public void bark()
    {
        System.out.println("bow bow");
    }
}
public class Animal extends Dog{
    public void sound()
    {
        System.out.print("sound of a dog:");
    }
    public static void main(String args[])
    {
        Animal a=new Animal();
        a.sound();
        a.bark();
    }
}
