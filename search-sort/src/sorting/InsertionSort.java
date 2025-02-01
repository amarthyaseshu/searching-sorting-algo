import java.util.Arrays;

public class InsertionSort {

    /*
    In insertion sort 1st select 2nd value & compare it with left side
    if its greater move that element to right side or else dont move
    next select 3rd element & compare with left side
     */
    public static void main(String[] args) {

        int[] arr={3,1,8,6,2};

        for(int i=1;i< arr.length;i++){
            int tempVal=arr[i];
            for(int j=i-1;j>=0;j--){
                if(arr[j]>=tempVal){
                    arr[j+1]=arr[j];
                }else{
                    arr[j+1]=tempVal;
                    break;
                }
                if(j==0){
                    if(arr[0]>=tempVal) {
                        arr[0] = tempVal;
                    }else{
                        arr[i]=tempVal;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
