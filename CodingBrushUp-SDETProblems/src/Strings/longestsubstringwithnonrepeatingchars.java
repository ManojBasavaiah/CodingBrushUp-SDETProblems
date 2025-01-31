package Strings;

import java.util.HashMap;
import java.util.HashSet;

public class longestsubstringwithnonrepeatingchars {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int n = str.length();
        int maxlength = 0, start = 0;
        String longestsubstring = "";
        HashSet<Character> set = new HashSet<>();
        // find longest substring without repeating characters
        for (int end = 0; end < str.length(); end++) {
            char currentchar = str.charAt(end);
            while (set.contains(currentchar)) {
                set.remove(str.charAt(start));
                start++;
            }
            set.add(currentchar);
            if (end - start + 1 > maxlength) {
                maxlength = end - start + 1;
                longestsubstring = str.substring(start, end + 1);
            }
        }
        //count number of times substring is repeated
        int count = 0;
        int index= 0;
        while ((index=str.indexOf(longestsubstring, index))!=-1){
            count++;
            index++;
        }
        System.out.println(longestsubstring+" : repeated for "+count);
    }

    }
