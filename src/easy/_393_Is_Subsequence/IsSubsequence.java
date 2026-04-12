package easy._393_Is_Subsequence;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "b";
        String t = "abc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        int index = 0;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            if (index < s.length() && tChar[i] == sChar[index]) {
                    str.append(tChar[i]);
                    index++;
                }

        }
        return str.toString().equals(s);
    }
}
