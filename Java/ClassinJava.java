class Calc
{

    public int add(int num1, int num2)
    {
        int r = num1+num2;
        return r;
    }

    public int sub(int num1, int num2)
    {
        int r = num1-num2;
        return r;
    }



}

public class ClassinJava 
{
public static void main(String[] args) 
{
    int num1 = 4;
    int num2 = 5;
    Calc c = new Calc();
    int result  = c.add(num1,num2);
    
    System.out.println(result);  
    
}


    
}
