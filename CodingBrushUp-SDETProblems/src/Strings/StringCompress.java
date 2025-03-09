package Strings;

import java.util.HashMap;

public class StringCompress { // here

    public static void main(String[] args){

        String value="aaabbccdddd";

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<value.length();i++){
            char ch=value.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        for(Character key:map.keySet()){
            System.out.print(key+" "+map.get(key)+"\n");
        }
    }
}
