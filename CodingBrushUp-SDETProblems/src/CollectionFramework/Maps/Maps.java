package CollectionFramework.Maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Apple");
        hm.put(2, "Mango");
        hm.put(3, "Banana");
        hm.put(4, "Grapes");
        System.out.println(hm);
        Iterator it = hm.entrySet().iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(hm.get(4));
        for (Entry entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        for (Entry entry : hm.entrySet()) {
            if (entry.getValue().equals("Mango")) {
                System.out.println("Mango is present");
            }
            if (entry.getKey().equals(4)) {
                System.out.println(entry.getValue());


            }

        }
    }
}
