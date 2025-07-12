public class ExceptionHandling 
{
    public static void main(String[] args) 
    {
        //multiple catches can be used
        int i= 4;
        int j=0;
        int nums[] = new int[5];

        try 
        {
            j = 18/i;
            System.out.println(nums[1]);
            System.out.println(nums[4]); //this will be out of bounds
        } 
        catch (ArithmeticException e)
        {
            System.out.println("Wrong math");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limits");
        }
        catch (Exception e) 
        {
            System.out.println("Something went wrong");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
