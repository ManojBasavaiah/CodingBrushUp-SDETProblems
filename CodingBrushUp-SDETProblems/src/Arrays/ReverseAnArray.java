package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String [] args){

        int[] arr ={1,2,3,4,5,6};

        System.out.println("Array in reverse order");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");

        /*String ar=Arrays.toString(arr);
        StringBuffer ar1 = new StringBuffer(ar);
        char[] ar2=ar1.reverse().toString().toCharArray();
        System.out.println(ar2);*/
    }
}
