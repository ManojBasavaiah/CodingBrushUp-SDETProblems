package Strings;

import java.util.Scanner;

public class StringReverse {

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        String s=sc.next();

        //String s="selenium";
     String s1= s.substring(0,1).toUpperCase()+" "+s.substring(0);
       System.out.println(s1);
        String rev="";

        //Using standard method
       /*for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.print(rev);
*/
        //Using stringBuffer
        //StringBuffer is a class in java that is used to manipulate strings.
        StringBuffer sb=new StringBuffer(s);
        StringBuffer reversed=sb.reverse();
        String rev1=reversed.toString();
        System.out.println(reversed);
        if(rev1.equalsIgnoreCase(s)){
            System.out.println("palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
