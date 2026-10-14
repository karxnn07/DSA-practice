package ArrayList;
import java.util.*;

public class Operations {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add  TC=0(1)
        list.add(1);  
        list.add(2);  
        list.add(3);  
        list.add(4);  
        list.add(5);  

        System.out.println(list);

        // list.add(1,9); // TC = 0(n)
        // System.out.println(list);

        // Get element  TC = 0(1)
        int element = list.get(2);
        System.out.println(element);

        // Remove element  TC = 0(n)
        // list.remove(1);
        // System.out.println(list);

        // Set element  TC = 0(n)
        // list.set(1,10);
        // System.out.println(list);

        // Contains element TC = 0(n)
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

        // Size of an ArrayList:
        System.out.println(list.size());
        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
