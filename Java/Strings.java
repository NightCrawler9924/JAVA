public class Strings {
    public static void main(String[] args) 
    {
        String name = "Deepansh";
        System.out.println(name.charAt(2));


        //now in order to make this mutable, we can use Stringbuffer

        StringBuffer sb = new StringBuffer("deepansh");
        sb.append(" Sabharwal");
        System.out.println(sb);
    }
    
}
