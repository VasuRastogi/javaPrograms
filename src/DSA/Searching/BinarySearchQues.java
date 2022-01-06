package DSA.Searching;

import java.util.Arrays;

public class BinarySearchQues {

    //Q. find ceil(15) in the given array.

    static int search(int[] arr, int start, int end, int target) { //recursive way

        if(start<=end) {
            int mid = start + (end - start) / 2;   // preventing operator overflow.
            if(arr[mid]==target){
                return arr[start+1];
            }
            if (arr[mid] > target){

                return search(arr, start, mid-1, target);
            }
            else if (arr[mid]<target){
                return search(arr, mid+1, end, target);
            }
        }
        return arr[start];
    }

    public static void main(String[] args) {
        // Array declaration
        int [] arr = new int[]{2,3,5,9,14,16,18};
        // target selection
        int target =15;
        //Printing array and value to search
        System.out.printf("Searching in: "+ Arrays.toString(arr)+" \nValue to Search: ceil("+target+")\n");
        //method calling.
        int value = search(arr, 0,arr.length-1, target);
        //printing out index.
        System.out.println("Answer is: "+value);
    }
}
