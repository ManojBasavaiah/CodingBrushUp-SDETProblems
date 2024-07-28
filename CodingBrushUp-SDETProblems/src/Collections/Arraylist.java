package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        //Declaration
        //Arraylist mylist=new Arraylist();-->valid
//        List mylist = new ArrayList(); --> valid
//        Arraylist <String> mylist = new Arraylist<String>();
        List mylist=new ArrayList(Arrays.asList(1,2, "man", 24.66f, null));
        System.out.println(mylist);
        mylist.add(50);
        System.out.println(mylist); // add value at end
        System.out.println(mylist.reversed());//reverse array
        System.out.println(mylist.size());//outputs total values in arraylist
        System.out.println(mylist.get(3));// outputs value at 3 index
        mylist.add(0,"tiger");
        System.out.println(mylist);
        List<Integer> integers = new ArrayList<Integer>();
        for(Object x:mylist){
            if(x instanceof Integer){
                integers.add((Integer) x);
                System.out.println(x);
                int maxVal= Collections.max(integers);
                System.out.println(maxVal);
            }

//
        }


    }

}
