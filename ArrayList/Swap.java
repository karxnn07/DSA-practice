package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Swap {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Swap
        // int temp = numbers.get(2);
        // numbers.set(2, numbers.get(0));
        // numbers.set(0, 30);

        Collections.swap(numbers, 0, 2);

        System.out.println(numbers);
    }
}