package Numbers;

import java.util.Scanner;

public class ArmstrongNumber {
//Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits
// 153 = 1*1*1 + 5*5*5 + 3*3*3
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int orgNum=num;

        int n,sum=0;

        while(num>0){
            n=num%10;
            num=num/10;
            sum=sum+n*n*n;
        }
        if(orgNum==sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
}
