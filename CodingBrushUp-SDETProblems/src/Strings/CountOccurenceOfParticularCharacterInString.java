package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountOccurenceOfParticularCharacterInString {


        public static void main(String[] args) {
                String str="Praveen";
                str=str.toLowerCase();
                char[] charArray = str.toCharArray();
                int occurrence = 0;
                char toFind='e';
                for (int i:charArray) {
                    if (toFind == i) {
                        occurrence++;
                    }
                }
                System.out.println("Character "+toFind+" present " +occurrence+ " times");

//                HashMap way
            HashMap <Character, Integer> chars = new HashMap<>();
            for(char character:charArray){
                if(chars.containsKey(character)){
                    chars.put(character,chars.get(character)+1);
                }

                else{
                    chars.put(character,1);
                }
            }
            Set<Map.Entry<Character, Integer>> set = chars.entrySet(); // <Map.Entry>
            for (Map.Entry<Character, Integer> entry : set) {
                if(entry.getKey().equals(toFind)){
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }
            }
            }
}



