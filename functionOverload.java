public class functionOverload {
    public static void main(String[] args) {
        System.out.println("Please enter the numbers: ");
        System.out.println("Sum is: "+sum(10, 20, 30, 30));
    }
    static int sum(int a, int b){
        int Sum = a + b;
        return Sum;
    }
    static int sum(int a, int b, int c){
        int Sum = a + b + c;
        return Sum;
    }
    static int sum(int a, int b, int c, int d){
        int Sum = a + b + c + d;
        return Sum;
    }
}
