public class ExceptionThrow
{
    public static void main(String[] args) 
    {
        int i= 20;
        int j=0;

        try 
        {
            j = 18/i;
            if (j==0)
            {
                throw new ArithmeticException("I dont want to do this");
            }

        } 
        catch (ArithmeticException e)
        {
            System.out.println("Wrong math "  + e);
        }
        catch (Exception e) 
        {
            System.out.println("Something went wrong");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
