import java.util.Scanner;

public class lcm1 {
    public static void main(String[] args) {
        

        System.out.println("Please enter the numbers: ");
        Scanner newScanner = new Scanner(System.in);
        int num1 = newScanner.nextInt();
        int num2 = newScanner.nextInt();
        newScanner.close();
        System.out.println("You've entered: "+num1+" "+num2);

        int absolute = Math.abs(num1*num2);

        System.out.println("LCM of these number is: "+absolute/gcd1.gcdNumber(num1,num2));
    }
    
}
