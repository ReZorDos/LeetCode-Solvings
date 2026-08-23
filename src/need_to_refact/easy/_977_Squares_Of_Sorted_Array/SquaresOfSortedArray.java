package need_to_refact.easy._977_Squares_Of_Sorted_Array;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        int indexResult = nums.length - 1;

        while (left <= right) {
            if (nums[left]*nums[left] > nums[right]*nums[right]) {
                result[indexResult] = nums[left]*nums[left];
                left++;
                indexResult--;
            } else {
                result[indexResult] = nums[right]*nums[right];
                right--;
                indexResult--;
            }
        }
        return result;
    }

    public static int[] sortedSquares2(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];

        for (int i = result.length; i >= 0  ; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }

        return result;
    }
}
