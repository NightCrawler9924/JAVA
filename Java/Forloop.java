public class Forloop 
{
    public static void main(String[] args) 
    {
        // for(int i = 0; i < 6; i++)
        // {
        //     System.out.println("Hi" + i);
        // }



        // Office calendar

        for( int i = 1; i<=9; i++)
        {
            System.out.println("DAY"+ i);

            for( int j = 1; j<=9; j++)
            {
                System.out.println(" " + (j+8) +  "--" + (j+9) );
            }
                
        }

    }
}
