package cwh.collections;

import java.util.ArrayDeque;

public class ArrayDeque_cwh {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1= new ArrayDeque<>();
        ad1.add(6);
        ad1.add(150);
        ad1.addFirst(16);
        ad1.addLast(151);
        System.out.println(ad1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getClass());
        System.out.println(ad1.getLast());
    }
}
