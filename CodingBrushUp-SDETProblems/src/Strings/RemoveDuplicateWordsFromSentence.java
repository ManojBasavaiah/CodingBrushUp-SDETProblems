package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateWordsFromSentence
{
    public static void main (String [] args)
    {
        String str = "Hello I am Japneet Japneet am";
        printSentenceWithoutDuplicates(str);
    }

    private static void printSentenceWithoutDuplicates(String str)
    {
        String [] strSplit = str.split("\\s");
        Map<String, Integer> map = new HashMap<>();
        int counter = 1;

        for (String s : strSplit) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, counter);
            }
        }
        Set<Map.Entry<String, Integer>> set = map.entrySet(); // <Map.Entry>
        for(Map.Entry<String,Integer> entryMap: map.entrySet())
        {
                System.out.print(entryMap.getKey()+" ");
        }
        /*map.entrySet().stream()
                .filter(entryMap -> entryMap.getValue() == 1)
                .map(entryMap -> entryMap.getKey() + " ")
                .forEach(System.out::print);*/
    }
}
