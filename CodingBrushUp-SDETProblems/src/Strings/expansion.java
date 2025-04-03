package Strings;

public class expansion {
    String expand(String encode){
        StringBuilder decode = new StringBuilder();
        for(int i=0; i<encode.length(); i++){
            char letter = encode.charAt(i);
            i++;
            int count = Character.getNumericValue(encode.charAt(i));
            decode.append(String.valueOf(letter).repeat(count));
        }
        return decode.toString();
    }
    public static void main(String[] args) {
        String encoding = "a2b3c1d4";
        expansion ex = new expansion();
        System.out.println(ex.expand(encoding));
    }
}
