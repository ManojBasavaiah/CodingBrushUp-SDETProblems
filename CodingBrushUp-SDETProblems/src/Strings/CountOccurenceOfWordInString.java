package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOccurenceOfWordInString {

    public static void main(String[] args){

        String s="Java Program Java Program Selenium. For test- it is best best jgyf,";
        String[] eachWord=s.split("\\W+");
        // \\W+ refers to

        HashMap<String,Integer> countOccurence=new HashMap<>();
        for(String singleWord:eachWord){
            if(countOccurence.containsKey(singleWord)){
                countOccurence.put(singleWord,countOccurence.get(singleWord)+1);
            }
            else{
                countOccurence.put(singleWord,1);
            }
        }
        System.out.println(countOccurence);

        Set<Map.Entry<String, Integer>> set=countOccurence.entrySet();
        for(Map.Entry<String,Integer> duplicateWords:countOccurence.entrySet()){
            if(duplicateWords.getValue()>1){
                System.out.println("Key is "+duplicateWords.getKey()+" Value "+duplicateWords.getValue());
            }
        }
            System.out.println(set);
        }
    }

