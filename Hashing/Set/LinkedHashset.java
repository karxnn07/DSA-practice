package Set;
import java.util.*;

import Set.LinkedHashset;

public class LinkedHashset {
    public static void main(String args[]) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        lhs.add("Gurugram");

        System.out.println(lhs);

        lhs.remove("Delhi");
        System.out.println(lhs);
    }
}
