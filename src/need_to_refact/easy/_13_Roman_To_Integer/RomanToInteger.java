package need_to_refact.easy._13_Roman_To_Integer;

import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        int result = romanToInt("IV");
        System.out.println(result);
    }

    public static int romanToInt(String s) {
        int result = 0;
        Map<Character,Integer > digits = Map.of(
                    'I', 1,
                    'V', 5,
                    'X', 10,
                    'L', 50,
                    'C', 100,
                    'D', 500,
                    'M', 1000
        );

        for (int i = 0; i < s.length(); i++) {
            int current = digits.get(s.charAt(i));
            int next = i + 1 < s.length() ? digits.get(s.charAt(i + 1)) : 0;

            if (current < next) {
                result += next - current;
                i++;
            } else {
                result += current;
            }
        }

        return result;
    }
}
