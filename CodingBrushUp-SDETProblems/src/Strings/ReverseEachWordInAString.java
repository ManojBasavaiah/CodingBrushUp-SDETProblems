package Strings;

import java.util.Arrays;

public class ReverseEachWordInAString {

    public static void main(String[] args) {

        String word="Java Programming Selenium";
        String[] splitted=word.split("\\s");
        String actualReversedString="";
        StringBuffer s1=new StringBuffer(word);
        System.out.println(s1.reverse().reverse().toString());

        for (String s:splitted){
            String reversed="";
            for(int i=s.length()-1;i>=0;i--){
                reversed=reversed+s.charAt(i);
            }
            actualReversedString=actualReversedString+reversed+" ";
        }
        System.out.println(actualReversedString);
    }
    }

