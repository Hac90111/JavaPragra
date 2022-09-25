package cwh.collections;
import java.util.*;

public class ArrayList_cwh {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();  // Dynamic array, min Capacity by default 10
        ArrayList<Integer> l2= new ArrayList<>(5);  //providing initial capacity

        l2.add(16);
        l2.add(6);
        l2.add(82);
        l2.add(65);
        l2.add(26);

        l1.add(2);
        l1.add(5);
        l1.add(6);
        l1.add(1, 9);  // index and element
        l1.addAll(l2);  //adding all elements of l2, it's appends all l2 elements in the end unless specified the index
       // l2.clear();  // Clearing all the elements of list

        l1.set(5, 145); //setting the existing element with new one(update)

        System.out.println(l1.listIterator(6));

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1.contains(5)); //whether element is in the list
        System.out.println(l1.indexOf(6)); //finding the index
        System.out.println(l1.lastIndexOf(6)); // find the index of last element if it's duplicate
        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
