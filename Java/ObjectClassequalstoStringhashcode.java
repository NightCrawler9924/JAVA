

class Laptop
{
    String model;
    int price;

    public String toString()
    {
        return model + " : " + price;
    }

    public boolean equals (Laptop that)
    {
        if (this.model.equals(that.model) && this.price == that.price)
            return true;
        else
            return false;
    }
}




public class ObjectClassequalstoStringhashcode 
{
    public static void main(String[] args) 
    {
        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 10000;

        System.out.println(obj); //Weird output
        //Original output Laptop@7852e922
        //New output Lenovo Yoga : 10000
    }
}
