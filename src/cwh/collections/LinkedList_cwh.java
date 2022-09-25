package cwh.collections;

import java.util.LinkedList;

public class LinkedList_cwh {
    public static void main(String[] args) {
        LinkedList<Integer> l1= new LinkedList<>();  // Cannot provide initial capacity
        LinkedList<Integer> l2= new LinkedList<>();

        l2.add(16);
        l2.add(6);
        l2.add(82);
        l2.add(65);
        l2.add(26);

        l1.add(2);
        l1.add(5);
        l1.add(6);
        l1.addLast(151); //adding the last element
        l1.add(1, 9);  //
        l1.addAll(l2);


        l1.set(5, 145);

        System.out.println(l1.listIterator(6));

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1.contains(5));
        System.out.println(l1.lastIndexOf(6));
        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}

