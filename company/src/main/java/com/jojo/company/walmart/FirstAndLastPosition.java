package com.jojo.company.walmart;

public class FirstAndLastPosition {

    // Find First and Last Position of Element in Sorted Array

    //Input: nums = [5,7,7,8,8,10], target = 8
    //Output: [3,4]

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6};
        int target = 7;

        int[] result = new int[2];

        result[0] = findFirstPosition(nums, target);
        result[1] = findLastPosition(nums, target);
        for(int num: result)
            System.out.println(num);
    }


    public static int findFirstPosition(int[] nums, int target)    {

        int start = 0;
        int end = nums.length - 1;
        int firstPostion = -1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(target <= nums[mid]) {
                end = mid - 1;
            } else
                start = mid + 1;

            if(target == nums[mid]) {
                firstPostion = mid;
                if((mid - 1) > 0 && nums[mid] > nums[mid - 1])
                    break;
            }
        }
        return firstPostion;
    }

    public static int findLastPosition(int[] nums, int target)    {

        int start = 0;
        int end = nums.length - 1;
        int lastPosition = -1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(target >= nums[mid]) {
                start = mid + 1;
            } else
                end = mid - 1;

            if(target == nums[mid]) {
                lastPosition = mid;
                if((mid + 1) < nums.length && nums[mid] < nums[mid + 1] )
                    break;
            }
        }
        return lastPosition;
    }
}
