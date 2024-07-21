package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterInAString {

    public static void main(String[] args) {
        String actualWord = "Dhayanidhi";
        String actualword=actualWord.toLowerCase();
        char[] eachChar=actualword.toCharArray();

        HashMap<Character,Integer> occurence=new HashMap<>();

        for(char singleletter:eachChar){
            if(occurence.containsKey(singleletter)){
                occurence.put(singleletter,occurence.get(singleletter)+1);
            }
            else{
                occurence.put(singleletter,1);
            }
        }
        Set<Map.Entry<Character, Integer>> set = occurence.entrySet(); // <Map.Entry>
        for (Map.Entry<Character, Integer> entry : occurence.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey()
                        + " : "
                        );
            }

        }
    }
}
