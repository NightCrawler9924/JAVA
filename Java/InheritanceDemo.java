
//to check if i can access this class in a different file
//the original calc class was made in ClassinJava.java
//We directly inherited from that
public class InheritanceDemo 
{
 public static void main(String[] args) 
 {
    Calc obj = new Calc();
    int r1 = obj.add(4,6);
    int r2 = obj.sub(10,7);
    System.out.println(r1 + " and " + r2);

 }   
}
