public class Person {
    protected String name;
    protected int age;
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    private String studentId;
    public Student(String name, int age, String studentId) {
        super(name, age); 
        this.studentId = studentId;
    }
    public Student()
    {
        super();
        this.studentId="null";
    }
    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Student ID: " + studentId);
    }
    public static void main(String[] args) {
        Student student1 = new Student("Bob", 20, "S12345");
        student1.displayInfo();
        Student student2 = new Student("Charlie", 22, "S67890");
        student2.displayInfo();
        Student s3=new Student();
        s3.displayInfo();
    }
}
