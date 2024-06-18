import java.io.*;
public class EmployeeManager 
{
    public void writeToFile(String data)
    {
        String fn="employees.txt";
        try
        {
            FileWriter fw=new FileWriter(fn,false);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(data);
            bw.close();
            System.out.println("Data has been written to:"+fn);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String args[])
    {
        EmployeeManager e1=new EmployeeManager();
        e1.writeToFile("Hi i am dhanush");
    }
}
