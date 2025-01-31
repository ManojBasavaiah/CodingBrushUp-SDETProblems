package Numbers;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();

        //Using Logic
       int rev=0;

        while (num>0){
            rev= rev*10 + num%10;
            num=num/10;
        }
        System.out.println("Reversed number is "+rev);

        //Using StringBuffer
        int number=1325635;
        String num1 = Integer.toString(number);
        StringBuffer sb=new StringBuffer(num1);
        String rev1= sb.reverse().toString();
        int rev2=Integer.parseInt(rev1);
        System.out.println("Reversed number is "+rev2);

        //Using StringBuilder

//        StringBuilder sbl=new StringBuilder();
//        sbl.append(num);
//        StringBuilder rev1= sbl.reverse();
//
//        System.out.println("Reversed number is "+rev1);
    }


}
