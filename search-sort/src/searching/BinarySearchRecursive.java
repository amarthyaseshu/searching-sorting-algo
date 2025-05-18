

/*
Best Search algorithm for Sorted Arrays
 // O(log n)
 */
public class BinarySearchRecursive {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};

        int target=5;

        int result=binarySearchRecursive(arr,target,0,arr.length-1);

        System.out.println(result);

    }

    private static int binarySearchRecursive(int[] arr, int target, int left, int right) {

        if(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {

                 return binarySearchRecursive(arr,target,left,mid-1);
            }else {

                 return binarySearchRecursive(arr,target,mid+1,right);
            }
        }
        return -1;
    }


}
