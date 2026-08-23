package easy._2609_Find_Longest_Balanced_Substring_Binary_String;

public class FindLongestBalancedSubstringBinaryString {
    public static void main(String[] args) {

    }

    public int findTheLongestBalancedSubstring2(String s) {
        String temp = "01";
        int result = 0;

        while (temp.length() <= s.length()) {
            if (s.contains(temp)) {
                result = temp.length();
            }
            temp = "0" + temp + "1";
        }
        return result;
    }

    public int findTheLongestBalancedSubstring(String s) {
        char[] sChars = s.toCharArray();
        int result = 0;
        char lastNum = '2';
        int sumZero = 0;
        int sumOne = 0;

        for (int i = 0; i < s.length(); i++) {
            if (lastNum == '1' && sChars[i] == '0') {
                result = Math.max(result, Math.min(sumOne, sumZero) * 2);
                sumOne = 0;
                sumZero = 1;
            } else if (sChars[i] == '0') {
                sumZero++;
            } else {
                sumOne++;
            }
            lastNum = sChars[i];
        }

        return result;
    }
}
