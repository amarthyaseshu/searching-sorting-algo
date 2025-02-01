import java.util.Arrays;

public class SelectionSort {

    /*
    1st number is selected as smallest first & checks with elements right side
    if it's smaller, it'll be selected, till pointer reaches end the smallest will be selected
    this will be replaced by 1st number & it continues
     */
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3};

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
