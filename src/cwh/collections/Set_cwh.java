package cwh.collections;

import java.util.HashSet;

public class Set_cwh {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet= new HashSet<>(6,0.5f);  // refer to Java docs
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(12);
        myHashSet.add(3);
        myHashSet.add(6);  // it won't create duplicate entries
        System.out.println(myHashSet);

    }

}
