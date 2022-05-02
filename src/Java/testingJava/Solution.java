package Java.testingJava;

public class Solution {
    public static void main(String[] args) {
        int[]arr = new int[]{4,5,6,7,0,1,2};
        System.out.println(search(arr,0));
    }
     static int search(int[] nums, int target) {
//        int ans=-1;
        int pivot = findgreaternum(nums);
        if(pivot==-1){return binSrch(nums, target, 0, nums.length-1);}
        if(nums[pivot]==target){return pivot;}
        if(target>=nums[0]) {
            return binSrch(nums, target,0, pivot-1 );
        }
            return binSrch(nums, target, pivot+1, nums.length-1);
    }
    // 1. finding last number of greater array.
    public static int findgreaternum(int []nums){
        int end = nums.length-1;
        int start = 0;
        while(start<= end) {
            int mid = start+(end -start)/2;
            if (mid<end && nums[mid+1]<nums[mid]){return mid;}
            if (mid>start && nums[mid-1]>nums[mid]) {return mid-1;}
            if (nums[mid]<=nums[start]){end = mid -1;}
            else {start = mid+1;}
            }
        return -1;
    }
    public static int binSrch(int[]nums, int target, int start, int end) {

            while (end >= start) {
                int mid = start + (end - start) / 2;
                if (nums[mid] > target) {
                    end = mid - 1;
                } else if (nums[mid] < target) {
                    start = mid + 1;
                } else  {
                    return mid;
                }
            }
        return -1;
    }
}