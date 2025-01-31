package CollectionFramework.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayListDemo2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Apple");
        al.add(24.3);
        al.add(43);
        al.add('A');
        al.add(true);
        List al_dup = new ArrayList();
        al_dup.addAll(al);
        al_dup.add("Mango");
        System.out.println(al_dup);
        al_dup.removeAll(al);
        System.out.println(al_dup);
        // sorting an arraylist
        al_dup.add(1);
        al_dup.add(2);
        al_dup.add(3);
        al_dup.add(4);
        al_dup.add(5);
        Collections.sort(al_dup);
        al_dup.toArray();
        System.out.println("After Sorting " + al_dup);
    }
}
