
class Caesar
{
    public void show()
    {
        System.out.println("In A show");
    }
}


public class AnonymousInnerClass 
{
    public static void main(String[] args) 
    {
        Caesar obj = new Caesar()
        {
            public void show()
            {
                System.out.println("In New show");
            }
        };
        obj.show();
    }


}
