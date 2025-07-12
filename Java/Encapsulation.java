class Human
{
    private int age;
    private String name;

    //Setters
    // public void setage(int a)
    // {
    //     age  = a;
    // }

    //We can use THIS keyword as well. Works the same
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




public class Encapsulation 
{
    public static void main(String[] args) 
    {
        Human obj = new Human();
        obj.setage(10);
        obj.setname("Deepansh");
       
        System.out.println(obj.getname() + " : " + obj.getAge());
       //since both the instance variables are private, it can only be accessed in the same class as they present in.
        //obj.age = 20;
        //obj.name = "Deepansh";

    }
}
