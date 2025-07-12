import java.util.Scanner;

public class takeinput 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Enter a number");
        int num = input.nextInt();
        System.out.println("The number is, " + num);


    }
}
