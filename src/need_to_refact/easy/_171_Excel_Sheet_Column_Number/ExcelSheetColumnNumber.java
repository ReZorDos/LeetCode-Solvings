package need_to_refact.easy._171_Excel_Sheet_Column_Number;

/*
Given a string columnTitle that represents the column title as appears in an Excel sheet,
 return its corresponding column number.

Example 1:
Input: columnTitle = "A"
Output: 1

Example 2:
Input: columnTitle = "AB"
Output: 28

Example 3:
Input: columnTitle = "ZY"
Output: 701

Constraints:
1 <= columnTitle.length <= 7
columnTitle consists only of uppercase English letters.
columnTitle is in the range ["A", "FXSHRXW"].
 */

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AA"));
    }

    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int cur =(columnTitle.charAt(i) - 'A' + 1);
            result = result * 26 + cur;
        }
        return result;
    }
}
