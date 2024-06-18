public class Student
{
    private String name,studentid;
    private int age;
    public Student(String name,int age,String studentid)
    {
        this.name=name;
        this.age=age;
        this.studentid=studentid;
    }
    public void displayinfo()
    {
        System.out.println("Student name: "+name);
        System.out.println("age:"+age);
        System.out.println("Student ID:"+studentid);
    }
    public static void main(String args[])
    {
        Student s=new Student("Dhanush",20,"R21EH117");
        Student s1=new Student("Darshan", 18, "10290200");
        s.displayinfo();
        s1.displayinfo();
    }
}