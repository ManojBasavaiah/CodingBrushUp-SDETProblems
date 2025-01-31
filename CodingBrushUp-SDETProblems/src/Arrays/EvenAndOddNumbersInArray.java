package Arrays;

import java.util.Arrays;
import java.util.List;

public class EvenAndOddNumbersInArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Even numbers in array are ");
        //Extracting even numbers
        for (int num:a) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

            System.out.println("\nOdd numbers in array are ");
            //Extracting odd numbers
            for (int num:a) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                }
            }

            //Using Java Streams
//            List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//            arrayList.stream().filter(s -> s % 2 == 0).forEach(s -> System.out.println("Even numbers from Array " + s));
//
//            List<Integer> arrayList2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//            arrayList.stream().filter(s -> s % 2 != 0).forEach(s -> System.out.println("Odd numbers from Array " + s));
        }
    }


