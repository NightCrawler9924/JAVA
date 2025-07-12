class Mobile
{
    String brand;
    int price;
    static String type;
    // the static will the value constant for all the type, if we enter smartphone, all instances will be smartphone
}

public class Static 
{
    public static void main(String[] args) 
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "apple";
        obj1.price = 1000000;
        Mobile.type = "smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 900000;
        Mobile.type = "smartphone";

        Mobile mobiles[] = new Mobile[2];
        mobiles[0] = obj1;
        mobiles[1] = obj2;

        for(Mobile n : mobiles)
        {
            System.out.println(n.brand + " : " + n.price);
        }
    }
    
}
