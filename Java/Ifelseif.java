public class Ifelseif
{
    public static void main(String[] args) 
    {
        int x= 10;
        int y= 5;
        int z= 20;

        if(x<y)
            System.out.println("Works");      // For single statement inside conditions
        else if (y>z)                           // To check more conditions
            System.out.println("Okay");       
        else
        System.out.println("Doesn't work");
    }

    
}
