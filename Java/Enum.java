
enum Status
{
    Running, Failed, Pending, Success;
}



public class Enum 
{
    public static void main(String[] args) 
    {
        // int i = 5;
        Status s = Status.Running;
        // for (Status s:ss)
        // {
        //     System.out.println(s + " : " + s.ordinal());
        // }

        //method 1 using if else
        if (s == Status.Running)
            System.out.println("All good");
        if (s == Status.Failed)
            System.out.println("Not good");
        if (s == Status.Pending)
            System.out.println("Please Wait"); 
        if (s == Status.Success)
            System.out.println("Done");


        //Method 2 using switch

        switch (s)
        {
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Not good");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            case Success:
                System.out.println("Done");
                break;

        }
    }
}
