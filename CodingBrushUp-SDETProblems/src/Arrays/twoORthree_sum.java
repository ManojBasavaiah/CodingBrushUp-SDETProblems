package Arrays;

public class twoORthree_sum {
    public static void main(String[] args) {
        int[] arr={1, 4, 7, 19, 10, 25};
        int target=12;
        Boolean NumsFound=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j]+arr[k] == target) {
                        System.out.println(arr[i] + ":" + i + "," + arr[j] + ":" + j+","+arr[k]+":"+k);
                        NumsFound = true;
                        break;
                    }
                }
            }
        }if (!NumsFound) {
            System.out.println("No numbers give sum as target");
        }
    }
}
