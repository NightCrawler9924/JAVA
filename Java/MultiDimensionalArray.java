public class MultiDimensionalArray 
{
    public static void main(String[] args) 
    {
        int nums[][] = new int[3][4];

        for(int i=0;i<3;i++)
        {
            for(int j = 0; j<4; j++)
            {
                nums[i][j] = (int)(Math.random() * 100); // defualt value random gives is <1, so multiply by 100 to get proper values, We have done typecasting here.
                System.out.println(nums[i][j] + " ");
            }
        }

        for(int i=0;i<3;i++)
        {
            for(int j = 0; j<4; j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }  
    
    
    
    }
}
