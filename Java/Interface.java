
interface Kiwi
{
    void show();
    void config();
}

class Berries implements Kiwi
{
    public void show()
    {
        System.out.println("in show");
    }

    public void config()
    {
        System.out.println("in config");
    }
}


public class Interface 
{
    public static void main(String[] args) 
    {
        Kiwi obj;
        obj = new Berries();
        obj.show();
        obj.config();

    }
}
