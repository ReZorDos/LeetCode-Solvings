package easy._69_Sqrt;

/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

Constraints:
0 <= x <= 231 - 1
 */

public class Sqrt_X {
    public static void main(String[] args) {
        System.out.println(mySqrt(1));
    }

    public static int mySqrt(int x) {
        int left = 0;
        int right = x;
        int result = 0;
        while (left <= right) {
            long m = (left + right) / 2;
            if (m * m > x) {
                right = (int) (m - 1);
            } else if  (m * m < x) {
                left = (int) (m + 1);
                result = (int) m;
            } else {
                return (int) m;
            }
        }
        return result;
    }
}
