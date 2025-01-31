package Strings;

public class StringVSStringbuffer {

    public static void main(String[] args) {
        String s = new String("My name is");
        s.concat("Manoj");
        System.out.println(s); // returns only My name is
        String s1 = s.concat("Manoj");
        System.out.println(s1); // returns My name isManoj
   StringBuffer sb = new StringBuffer("My name is");
        sb.append("Manoj");
        System.out.println(sb); // returns My name isManoj
        s = "Lion";
        System.out.println(s);
        sb = new StringBuffer("Tiger");
        System.out.println(sb);
    }
}
