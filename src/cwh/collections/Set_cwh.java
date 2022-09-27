package cwh.collections;

import java.util.Date;
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

        //Date class

        Date date= new Date(); // refer to the docs for formatting
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(date.getDate());  //deprecated

    }

}
