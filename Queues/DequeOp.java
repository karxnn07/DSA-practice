package Queues;

import java.util.*;

public class DequeOp {
    public static void main(String args[]) {
        Deque<Integer> deque = new LinkedList<>();
        // Add First
        deque.addFirst(2);
        deque.addFirst(1);
        // Add Last
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        // Remove First
        deque.removeFirst();
        System.out.println(deque);
        // Remove Last
        deque.removeLast();
        System.out.println(deque);
        // Get First(peek())
        System.out.println("First Element = "+ deque.getFirst());
        // Get Last
        System.out.println("Last Element = "+ deque.getLast());
    }    
}