
class Apple 
{
    int age;

    public void show()
    {
        System.out.println("In show");
    }

    class Banana
    {
        public void config()
        {
            System.out.println("In config");
        }
    }
}

//How do i access B now?
public class InnerClass 
{
    public static void main(String[] args) 
    {
        Apple obj = new Apple();
        Apple.Banana obj1 = obj.new Banana();        
        obj1.config();

    }
}
