package easy._28_Find_Index_First_Occurrence_In_String;

public class FindIndexFirstOccurrenceInString {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issip"));
    }
    
    public static int strStr(String haystack, String needle) {
        if (needle == "") {
            return 0;
        }

        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();

        for (int i = 0; i < haystack.length() + 1 - needle.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystackChars[i + j] != needleChars[j]) {
                    break;
                }
                if (needle.length() - 1 == j) {
                    return i;
                }
            }
        }

        return -1;
    }

    // не проходит проверку
    public static int strStr2(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        int h = haystack.length();
        int n = needle.length();

        for (int i = 0; i < h - n; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

}
