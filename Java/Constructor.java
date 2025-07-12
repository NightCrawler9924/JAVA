class Human
{
    private int age;
    private String name;

    //This is the constructor. Everytime you call the obj, the constructor will be called.
    public Human()    //Default Constructor 
    {
        System.out.println("In constructor");
    }

    public Human(int a, String n)  //Parameterized Constructor
    {
        age = a;
        name = n;
    }

    public void setage(int age)
    {
        this.age = age;
    }
    
    public void setname(String b) 
    {
        name  = b;
    }
    
   //Getters 
    public int getAge()
    {
        return age;
    }
    
    public String getname()
    {
        return name;
    }
}

public class Constructor 
{
    public static void main(String[] args) 
    {
        Human obj = new Human();
        obj.setage(10);
        obj.setname("Deepansh");
       
        System.out.println(obj.getname() + " : " + obj.getAge());


    }

}