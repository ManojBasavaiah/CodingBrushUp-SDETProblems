package Strings;

public class repeatedsubstringwithnonrepeatingchars {
    public static void main(String[] args) {
        String input= "abcabcabcbbdabcdab";
        String longestRepeatingSubstring="";
        for(int len=1;len<input.length();len++){
            for(int i=0;i<=input.length()-len;i++){
                String substring=input.substring(i,i+len);
                if(input.indexOf(substring,i+1)!=-1 && substring.length()>
                        longestRepeatingSubstring.length()){
                    longestRepeatingSubstring=substring;
                }
            }
        }
        System.out.println(longestRepeatingSubstring);
        int count=0;
        int index=0;
        while ((index=input.indexOf(longestRepeatingSubstring, index))!=-1){
            count++;
            index++;
        }
        System.out.println(count);
    }
}
