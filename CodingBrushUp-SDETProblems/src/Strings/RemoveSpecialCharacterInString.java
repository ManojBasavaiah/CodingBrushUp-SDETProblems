package Strings;



public class RemoveSpecialCharacterInString {

    public static void main(String[] args){

        String s="@@$$%%%'';;/./ 657.879   Selenium";
        String replaced=s.replaceAll("[^a-z0-9A-z]","");
        System.out.println(replaced);
        String replaceS =s.replaceAll("[^a-zA-Z]", "");
        System.out.println(replaceS);
        System.out.println(s.replaceAll("[^0-9]","")); // prints only numbers
        System.out.println(s.replaceAll("[a-z0-9A-Z]",""));// prints only special characters

        //Change special character in a string
        String s1="@Praveen";
        String replacement=s1.replace("@","");
        System.out.println(replacement);

    }
}
