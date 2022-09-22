package DSA.Sorting.ComparisonSorting;

public class selectionSort {
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
    //Selection sorting algorithm
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = (arr.length - 1) - i;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    public static void main(String[]args){
        int [] arr = new int[]{1,2,3,7,6,5,4};
        selection(arr);
        System.out.println(arr);
    }
}
