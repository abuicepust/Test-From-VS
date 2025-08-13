import java.util.HashMap;
import java.util.Map;

public class map1 {

    public static void main(String[] args){
        Map<String, Integer> names = new HashMap<>();
        
        names.put("Imran", 1);
        names.put("Munim", 2);
        names.put("Mohshin", 3);

        System.out.println(names);

        for (String string : names.keySet()) {
            System.out.println(string+" Value "+names.get(string));
        }

    }
}