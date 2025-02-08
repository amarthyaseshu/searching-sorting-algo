import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {5,3,1,6,7,2,4,8};


        int swap;
        do {
            swap=0;
            for (int i = 0; i < arr.length-1; i++) {

                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap++;

                }

            }
        }while (swap>0);


        System.out.println(Arrays.toString(arr));


    }

    }
