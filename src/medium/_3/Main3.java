package medium._3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main3 {



    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        char[] chars = s.toCharArray();
        int left = 0;
        Set<Character> map = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            char curChar = chars[i];
            if (!map.contains(curChar)) {
                map.add(curChar);
                maxLength = Math.max(i - left + 1, maxLength);
            } else {
                while (map.contains(curChar)) {
                    map.remove(chars[left]);
                    left++;
                }
                map.add(curChar);
            }
        }
        return maxLength;
    }
}
