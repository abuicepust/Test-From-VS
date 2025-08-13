import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        
        System.out.println("Please enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        System.out.println("The Number You've entered: "+number);
        if (PrimeOrNot(number) == true) {
            System.out.println("It is a Prime Number");
        }else{
            System.out.println("It is not a Prime Number");
        }

    }
    static boolean PrimeOrNot(int n){
        if (n<=1) {
            return false;
        }
        for(int i=2;i<n;i++){
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
