/*
Best Search algorithm for Sorted Arrays
 // O(log n)
 */
public class BinarySearchIterative {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7};

        int target=5;

        int left=0;
        int right=arr.length-1;

        while (left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                break;
            } else if (arr[mid]>target) {
                right=mid-1;
            }else {
                left=mid+1;
            }
        }

    }

}
