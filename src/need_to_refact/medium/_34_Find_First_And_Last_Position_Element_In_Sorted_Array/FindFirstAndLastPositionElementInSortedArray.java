package need_to_refact.medium._34_Find_First_And_Last_Position_Element_In_Sorted_Array;

import java.util.Arrays;

public class FindFirstAndLastPositionElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr, 8)));

    }


    public static int[] searchRange(int[] nums, int target) {
        return new int[] {first(nums, target), last(nums, target)};
    }

    public static int last(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int index = (left + right) / 2;
            if (nums[index] > target) {
                right = index - 1;
            } else if (nums[index] < target) {
                left = index + 1;
            } else {
                ans = index;
                left = index + 1;
            }
        }
        return ans;
    }

    public static int first(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int index = (left + right) / 2;
            if (nums[index] > target) {
                right = index - 1;
            } else if (nums[index] < target) {
                left = index + 1;
            } else {
                ans = index;
                right = index - 1;
            }
        }
        return ans;
    }

}
