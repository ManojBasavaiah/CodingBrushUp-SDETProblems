package Arrays;

import java.util.Arrays;

public class ArraySorter {
    public static void sortArray(int[] arr, boolean ascending) {
        if (ascending) {
            Arrays.sort(arr); // Sort in ascending order
        } else {
            Arrays.sort(arr); // Sort in ascending order first
            reverseArray(arr); // Reverse the sorted array to get descending order
        }
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length-1 ;
        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // Move start and end pointers towards each other
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        boolean ascending = false; // Change to true for ascending order
        sortArray(arr, ascending);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

