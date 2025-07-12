class igloo extends Thread 
{
    public void run() 
    {
        for(int i = 1; i <= 100; i++) 
        {
            System.out.println("hi");
        }
    }
}

class ball extends Thread 
{
    public void run() 
    {
        for(int i = 1; i <= 100; i++) 
        {
            System.out.println("hello");
        }
    }
}

public class Threads 
{
    public static void main(String[] args) 
    {
        igloo obj1 = new igloo();
        ball obj2 = new ball();
        obj1.start();
        obj2.start();
    }
}
