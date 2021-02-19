import java.util.Scanner;
public class Q4
{
	public static void main(String[] args) {
	     Scanner input = new Scanner(System.in);
        int num1,num2,sum, mul,aug1=0,aug2=0;
        System.out.print("Enter a number: ");
        num1= input.nextInt();
        System.out.print("Enter a second number: ");
        num2= input.nextInt();
        // Arithmatic operator '+' adds two numbers
        sum = num1 + num2;
        // Arithmatic operator '*' multiplies two numbers
        mul = num1 * num2;
        System.out.println("The addition of numbers " + num1 + " and " + num2 + " is "+sum);
        System.out.println("The multiplication of numbers " + num1 + " and " + num2 + " is "+mul);
        // Augmented operator (+=) is used wherein the value of aug1 is added to num1 (aug1 = aug1 +num1)
        aug1 += num1;
        // Augmented operator (*=) is used wherein the value of aug1 is multiplied to num1 (aug2 = aug2*num2)
        aug2*= num2;
        System.out.println("The augmentation (addition) of number " + num1 + " is "+aug1);
        System.out.println("The augmentation (multiplication) of number " + num1 +  " is "+aug2);
    //Prefix increment operator is used wherein the value of num1 is incremented first and used later	   
	    num1++;
	//Postfix decrement operator is used wherein the value of num2 is used first and decremented later  
	    --num2;
	    System.out.println("The Prefix increment of the first input is "+num1);
        System.out.println("The Postfix decrement of the second input is "+num2);
	  
	    
	}
}