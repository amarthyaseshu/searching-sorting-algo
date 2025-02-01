import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr={1,7,8,9,2,3,1,6,3,8,2,9,1,4};
        for(int i=0;i<arr.length-1;i++){
            int shortestEleIndex=i;
            for(int j=i+1;j<arr.length;j++) {
                if (arr[j] < arr[shortestEleIndex]) {
                    shortestEleIndex = j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[shortestEleIndex];
            arr[shortestEleIndex]=temp;

        }
        System.out.println(Arrays.toString(arr));

    }
}
