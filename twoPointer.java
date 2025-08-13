import java.util.Scanner;

public class twoPointer {
    public static void main(String[] args) {

        System.out.println("Hello World");

        // String name = "aaa";
        // System.out.println(name);
        Scanner sc = new Scanner(System.in);
        String name2 = sc.nextLine();
        sc.close();
        System.out.println("" + Palindrome(name2));
        // System.out.println(reverseString);
    }

    static boolean Palindrome(String x) {

        // char[] chars = x.toCharArray();

        // int i = 0, j = x.length() - 1;
        // char temp;
        // while (i < j) {
        //     temp = chars[i];
        //     chars[i] = chars[j];
        //     chars[j] = temp;
        //     i++;
        //     j--;
        // }
        // String reverseString = new String(chars);
        // System.out.println(x);
        // System.out.println(reverseString);
        // if (reverseString.equals(x)) {
        //     return true;
        // } else {
        //     return false;
        // }
        int i=0,j=x.length()-1;

        while (i<j) {
            if (x.charAt(i) != x.charAt(j)) {
                return false;
            }
            i++;j--;
        }
        return true;
    }
}
