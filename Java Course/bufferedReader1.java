import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bufferedReader1{
    public static void main(String[] args){
        System.out.println("Please enter the number: ");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num = 0;

        try {
            num = Integer.parseInt(bf.readLine());
            
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(num);
        //bf.close();
        

        //System.out.println(num);
        
    }
}
