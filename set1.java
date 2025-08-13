import java.util.Set;
import java.util.TreeSet;

public class set1 {
    public static void main(String[] args) {
        System.out.println("Set Out");

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(7);
        numbers.add(13);
        numbers.add(8);
        numbers.add(15);
        numbers.add(19);

        System.out.println(numbers);

    }
}
