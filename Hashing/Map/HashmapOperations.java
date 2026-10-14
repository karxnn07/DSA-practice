package Map;
// package Hashing;

import java.util.HashMap;

public class HashmapOperations {
    public static void main(String args[]) {
        // Create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - 0(1)
        hm.put("India", 100);
        hm.put("US", 50);
        hm.put("China", 150);

        System.out.println(hm);

        // Get - 0(1)
        int Population = hm.get("India");
        System.out.println(Population);

        System.out.println(hm.get("Indonesia"));

        // ContainsKey - 0(1)
        System.out.println(hm.containsKey("India"));  //True
        System.out.println(hm.containsKey("Indonesia")); // False

        // Remove - 0(1)
        hm.remove("China");
        System.out.println(hm);

        // Size
        System.out.println(hm.size());

        // Is Empty
        hm.clear(); // Clear Function
        System.out.println(hm.isEmpty());

    }
}
