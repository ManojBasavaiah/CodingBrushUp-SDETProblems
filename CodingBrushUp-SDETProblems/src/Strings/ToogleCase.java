package Strings;

public class ToogleCase {
    public static void main(String[] args) {
        String str = "I aM vErY hOnest PeRsOn";
        String toogle_str = "";
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toogle_str = toogle_str + Character.toLowerCase(c);
            } else {
                toogle_str = toogle_str + Character.toUpperCase(c);
            }
        }
        System.out.println(toogle_str);
        String[] str1 = str.split(" ");
        StringBuffer finalOddEvenSentence = new StringBuffer();
        for (String s : str1) {
            String first = s.substring(0, 1);
            String afterfirst = s.substring(1);
            toogle_str = first.toUpperCase() + afterfirst.toLowerCase();
            System.out.println(toogle_str);
        }
        for(int i=0;i<str1.length;i++){
            if(i%2==0){
                finalOddEvenSentence.append(str1[i].toUpperCase());
            }else{
                finalOddEvenSentence.append(str1[i].toLowerCase());
            }
            finalOddEvenSentence.append(" ");
        }
        System.out.println(finalOddEvenSentence);
    }
}

