import java.util.Scanner;

public class gcd1 {
    public static void main(String[] args) {
        
        System.out.println("Please Enter the numbers");
        Scanner sc1Scanner = new Scanner(System.in);
        int num1 = sc1Scanner.nextInt();
        int num2 = sc1Scanner.nextInt();
        sc1Scanner.close();

        
        System.out.println("Number 1: "+num1+" Number 2: "+num2);
        System.out.println("GCD Of these two is: "+gcdNumber(num1, num2));
        
    }
    static int gcdNumber(int a, int b) {
        int i;
        if (a<b) {
            i = a;
        } else{
            i=b;
        }

        for(int j=i;j>1;j--){
            if (a % j == 0 && b % j == 0) {
                return i;
            }
        }

        return 1;
    }
}
