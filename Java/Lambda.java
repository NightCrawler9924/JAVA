@FunctionalInterface
interface All
{
    void show(int i);
}

public class Lambda 
{
    public static void main(String[] args) 
    {
        // All obj = new All() 
        // {
        //         public void show()
        //         {
        //             System.out.println("in show");
        //         }
        // };
        // obj.show();

        //instead of using all this we can use the lambda expression that narrows it down to one line

        All obj = (int i) ->  System.out.println("in show " + i);
        obj.show(5);

    }

}
