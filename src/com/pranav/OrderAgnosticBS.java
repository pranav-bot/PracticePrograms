package com.pranav;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,20,21,22,23,24};
        int[] arr={25,24,23,22,21,20,9,8,7,6,5,4,3,2,1};
        int target=20;
        int ans1=orderagnosticBS(nums,target);
        int ans2=orderagnosticBS(arr,target);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    static int orderagnosticBS(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        boolean isAsc = nums[start] < nums[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target > nums[mid]) {
                    start = mid + 1;
                } else if (target < nums[mid]) {
                    end = end - 1;
                }
            } else {
                if (target > nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}