package Strings;

public class reverse_without_changingSpace {
    public static void main(String[] args) {
        String input = "Manoj Basavaiah";
        char[] arr = input.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {

            if (!Character.isAlphabetic(arr[left])) {
                left++;
            }
            if (!Character.isAlphabetic(arr[right])) {
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(arr));
    }
}

