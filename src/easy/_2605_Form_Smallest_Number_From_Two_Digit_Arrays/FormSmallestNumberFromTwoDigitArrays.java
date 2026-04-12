package easy._2605_Form_Smallest_Number_From_Two_Digit_Arrays;

import java.util.HashSet;

public class FormSmallestNumberFromTwoDigitArrays {
    public static void main(String[] args) {

    }

    public int minNumber(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int min1 = 10;
        int min2 = 10;
        int minCommon = 10;
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
            min1 = Math.min(min1, nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                minCommon = Math.min(minCommon, nums2[i]);
            }
            min2 = Math.min(min2, nums2[i]);
        }
        if (minCommon != 10) {
            return minCommon;
        }
        return min1 > min2 ? min2*10+min1 : min1*10+min2;
    }

    public int minNumber2(int[] nums1, int[] nums2) {
        int val = Integer.MAX_VALUE;
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j])  val = Math.min(val,nums1[i]);
                val = Math.min(val,Math.min(nums1[i]*10+nums2[j],nums2[j]*10+nums1[i]));
            }
        }
        return val;
    }

}
