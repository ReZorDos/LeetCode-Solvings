package easy._88_Merge_Sorted_Array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[] {0, 0, 0, 0};
        int[] nums2 = new int[] {1, 2, 3, 4};
        merge(nums1, 0, nums2, 4);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        int curIndex = m + n - 1;
        while (index1 >= 0 && index2 >= 0) {
            if (nums2[index2] > nums1[index1]) {
                nums1[curIndex] = nums2[index2];
                index2--;
            } else if (nums1[index1] >= nums2[index2]) {
                nums1[curIndex] = nums1[index1];
                index1--;
            }
            curIndex--;
        }
        while (index2 >= 0) {
            nums1[index2] = nums2[index2];
            index2--;
        }
    }
}
