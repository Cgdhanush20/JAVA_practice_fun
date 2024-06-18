class Person
{
    private String name;
    private int age;
    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
public class Person_Encapsulation
{
    public static void main(String args[])
    {
        Person p=new Person("Dhanush",20);
        System.out.println("Nmae:"+p.getName());
        System.out.println("Age:"+p.getAge());
    }
}