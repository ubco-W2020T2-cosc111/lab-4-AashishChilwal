import java.util.Random;
public class Q5 {
    public static void main(String[] args) {
	
    String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
    char l1,l2,l3;
    int n1,n2,n3,n4;
    Random random = new Random();
     l1 = str.charAt(random.nextInt(26));
     l2 = str.charAt(random.nextInt(26));
     l3 = str.charAt(random.nextInt(26));
     
     n1 = (int)(Math.random() * 10);
     n2 = (int)(Math.random() * 10);
     n3 = (int)(Math.random() * 10);
     n4 = (int)(Math.random() * 10);


    System.out.println("A random vehicle plate number: " + l1 + l2 + 
        l3 + n1 + n2 + n3 + n4);

}
}
