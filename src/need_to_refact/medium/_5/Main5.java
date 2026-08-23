package need_to_refact.medium._5;

public class Main5 {

    public String longestPalindrome(String s) {
        String result = "";
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    result = s.substring(left, right + 1);
                }
                left--;
                right++;
            }

            int left2 = i;
            int right2 = i + 1;

            while (left2 >= 0 && right2 < s.length() && s.charAt(left2) == s.charAt(right2)) {
                if (right2 - left2 + 1 > maxLength) {
                    maxLength = right2 - left2 + 1;
                    result = s.substring(left2, right2 + 1);
                }
                left2--;
                right2++;
            }

        }
        return result;
    }

}
