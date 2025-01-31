package Strings;

public class reverse_without_changingSpace {
    public static void main(String[] args) {
        String input = "Manoj Basavaiah";
        char[] arr = input.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] == ' ') {
                left++;
                continue;
            }
            if (arr[right] == ' ') {
                right--;
                continue;
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

