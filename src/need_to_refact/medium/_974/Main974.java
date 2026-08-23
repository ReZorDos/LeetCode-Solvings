package need_to_refact.medium._974;

import java.util.HashMap;
import java.util.Map;

public class Main974 {
    public static void main(String[] args) {
        int[] nums = new int[] {4,5,0,-2,-3,1};
        System.out.println(subarraysDivByK(nums, 5));

    }

    public static int subarraysDivByK(int[] nums, int k) {
        int result = 0;
        Map<Integer, Integer> prefixSumFrequens = new HashMap<>();
        prefixSumFrequens.put(0, 1);
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int dif = (prefixSum % k + k) % k;

            result += prefixSumFrequens.getOrDefault(dif, 0);
            prefixSumFrequens.put(dif, prefixSumFrequens.getOrDefault(dif, 0) + 1);
        }

        return result;
    }
}
