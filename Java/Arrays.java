public class Arrays 
{
    public static void main(String[] args) 
    {
        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 5;
        nums[2] = 6;
        nums[3] = 7;

        for (int i = 0; i<nums.length; i++)
        //instead of specifying the number of iterations and making a mistake, we can use variable.length to get the exact number
        {
            System.out.println(nums[i]);
        
        }
    }
}
