package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountVowelsInAString {

    public static void main(String[] args){
        String s="SwAtHiiiAo";
        s=s.toLowerCase();
        char[] strchar=s.toCharArray();

        int count=0;
        //Normal way
//        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
//            count++;
//        }

        //Hashmap way
        HashMap<Character, Integer> map=new HashMap<>();
        for(char i:strchar){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else
            {
                map.put(i,1);
            }

            }
        Set<Map.Entry<Character, Integer>> set = map.entrySet(); // <Map.Entry>
        for (Map.Entry<Character, Integer> entry : set) {
            if(entry.getKey()=='a'||entry.getKey()=='e'||entry.getKey()=='i'||entry.getKey()=='o'||entry.getKey()=='u') {
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }

        System.out.println("Vowels present in String "+s+ " is " +count);
    }
}
