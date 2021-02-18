import java.util.Scanner;
public class Q3
{
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
        int integer,f,s,t,r,sum ;
        System.out.print("Enter an integer between 0 and 999 inclusive: ");
        integer = input.nextInt();

            f = integer % 10;
            r = integer / 10;
            s = r % 10;
            r = r / 10;
            t = r % 10;
            r = r / 10;
         sum = t + s + f ;
        System.out.println("The sum of all digits in " + integer + " is " + sum);

	}
}