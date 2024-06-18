

class MultiThreadDemo extends Thread
{
    public void run()
    {
    try{
    System.out.println("Thread "+Thread.currentThread().getId()+" is running");
    Thread.sleep(1000);
    }
    catch(Exception e)
    {
        System.out.println("Caught exception");
    }
    }
}
public class MultiThread
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            MultiThreadDemo m=new MultiThreadDemo();
            m.start();
        }
    }
}