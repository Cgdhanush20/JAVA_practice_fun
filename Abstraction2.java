abstract class Animal
{
    abstract void makeSound();
}
class Lion extends Animal
{
    public void makeSound()
    {
        System.out.println("i am lion");
    }
}
class Elephant extends Animal
{
    public void makeSound()
    {
        System.out.println("i am elephant");
    }
}
public class Abstraction2 
{
    public static void main(String[] args)
    {
        Lion l=new Lion();
        l.makeSound();
        Elephant e=new Elephant();
        e.makeSound();
    }
    
}
