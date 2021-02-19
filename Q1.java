import java.util.Scanner;
public class Q1
{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int temp,wc;
        double index ;
        System.out.print("Enter the temperature in Fahrenheit between -58 F and 41 F: ");
        temp = input.nextInt();
        double temp1 = temp;
        System.out.print("Enter the wind speed miles per hour (must be greater than or equal to 2): ");
        wc = input.nextInt();
        double wc1 = wc;
        index = (35.74+0.6215*temp1) - (35.75*Math.pow(wc1,0.16))+(0.4275*temp1*Math.pow(wc1,0.16));     
        System.out.println("The wind chill index is " + index);

    }
}
