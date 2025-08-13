public class increment {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(n);
        int preIncrement = ++n;
        System.out.println(preIncrement);
        int postIncrement = n++;

        System.out.println(postIncrement);
        System.out.println(n);
    }
}
