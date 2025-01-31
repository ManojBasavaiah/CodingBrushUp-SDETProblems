package CollectionFramework.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayListDemo1 {
    public static void main(String[] args) {
        // Declare Arraylist
        // below denotes hetrogenous arraylist with size 10
//        ArrayList al = new ArrayList(10);
        // below denotes homogenous arraylist with any size
//        List<String> la =new ArrayList<String>();
//        Printing an array
        int[] a = new int[]{1, 2, 3, 4, 5};
        for (int ap : a) {
            System.out.println(ap);
        }
        // Print a list
        List al = new ArrayList();
        al.add(0, "dog");
        al.add(1, 10);
        al.add(2, 20);
        al.add(3, 30);
        al.add(4, 40);
        System.out.println(al);

        al.remove(1);
        System.out.println(al);
        System.out.println(al.get(1));
        if (al.contains("Dog")) {
            System.out.println("It contains Dog");
        } else if (al.contains("dog")) {
            System.out.println("It contains dog");
        }
        List ar=al.reversed();
        System.out.println(ar);
        System.out.println(ar.size());
        ar.set(1, 10);
        System.out.println(ar);
        System.out.println(ar.isEmpty());
        System.out.println("-----------Reading the data---------------------");
        // 1) Using for loop
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
        // 2) Using for each loop
        for(Object e:ar){
            System.out.println(e);
        }
        //3) Using Iterater
        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
