
class Computer
{
    public void PlayMusic(){              //void means it will return nothing

        System.out.println("Music is playing");
    }  

    public String GetmeaPEN(int cost)
    {
        if (cost>=10)
            return "Here's the pen";
        
        return "No pen for you";

    }
}


public class Methods 
{
    public static void main(String[] args) 
    {
        Computer obj = new Computer();
        obj.PlayMusic();
        String s = obj.GetmeaPEN(12);
        System.out.println(s);

    }
}
