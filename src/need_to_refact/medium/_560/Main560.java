package need_to_refact.medium._560;

import java.util.HashMap;
import java.util.Map;

public class Main560 {

    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumFrequencies = new HashMap<>();
        prefixSumFrequencies.put(0, 1);
        int result = 0;
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int dif = prefixSum - k;
            result += prefixSumFrequencies.getOrDefault(dif, 0);
            prefixSumFrequencies.put(prefixSum, prefixSumFrequencies.getOrDefault(prefixSum, 0) + 1);
        }

        return result;
    }

}
