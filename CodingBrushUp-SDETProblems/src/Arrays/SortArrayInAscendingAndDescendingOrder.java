package Arrays;

public class SortArrayInAscendingAndDescendingOrder {

    public static void main(String[] args){

        int[] arr=new int[] {2,4,10,8,11,13,15};
         int temp=0;
         int size=arr.length;

         for(int i=0;i<size;i++){
             for(int j=i+1;j<size;j++){
                //if told to sort in descending order then change the greater symbol to arr[j]
                 if (arr[i]>arr[j])  {
                     temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                 }
             }
         }
        //System.out.println();
        System.out.println("Elements of sorted array in ascending order ");
         for(int i:arr){
             System.out.print(i+" ");
         }
         //System.out.println();
        //System.out.println("Second Largest in a array "+arr[size-2]);


         //if you want find second smallest in array..THen sort it to descending order and get size-value
        System.out.println("Second largest in a array "+arr[size-2]);
        System.out.println("Second Smallest in a array "+arr[size-6]);
    }
}
