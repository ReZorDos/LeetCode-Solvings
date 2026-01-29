package easy._20_Valid_Parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true

Example 5:
Input: s = "([)]"
Output: false

Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */

public class ValidParentheses {

    public static void main(String[] args) {
        boolean result = isValid("()[]{}");
        System.out.println(result);
    }

    public static boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                deque.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (deque.isEmpty()) {
                    return false;
                }
                char firstParenthese = deque.pop();
                if (!(ch == ')' && firstParenthese == '(') &&
                        !(ch == ']' && firstParenthese == '[') &&
                        !(ch == '}' && firstParenthese == '{')) {
                    return false;
                }
            }
         }

        return deque.isEmpty();
    }

}
