public class Student1
{
    private String name,studentid;
    private int age;
    private float fees;
    public Student1(String name,int age,String studentid,float fees)
    {
        this.name=name;
        this.age=age;
        this.studentid=studentid;
        this.fees=fees;
    }
    public Student1()
    {
        System.out.println("Default");
    }
    public void displayinfo()
    {
        System.out.println("Student name: "+name);
        System.out.println("age:"+age);
        System.out.println("Student ID:"+studentid);
        System.out.println("fees:"+fees);
    }
    public static void main(String args[])
    {
        Student1 s=new Student1("Dhanush",20,"R21EH117",100092.876f);
        Student1 s1=new Student1();
        s1.displayinfo();
        s.displayinfo();
    }
}
