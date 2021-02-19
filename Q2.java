import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner real= new Scanner(System.in);
   double realn,frac;
   int integer;
   System.out.print("Enter the real number: ");
   realn=real.nextDouble();
   
   integer = (int)realn;
   frac = (10 * realn - 10 * integer)/10;
   
   System.out.println("Integer part: "+integer);
   System.out.println("Fraction part: "+frac);
   
       }
}
