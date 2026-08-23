package need_to_refact.easy._844_Backspace_String_Compare;

import java.util.Objects;

public class BackspaceStringCompare {

    public static void main(String[] args) {
        String s = "xywrrmp";
        String t = "xywrrmu#p";
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        StringBuilder tempS = new StringBuilder();
        StringBuilder tempT = new StringBuilder();
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (charS[i] == '#') {
                if (tempS.length() > 0) tempS.deleteCharAt(tempS.length() - 1);

            } else {
                tempS.append(charS[i]);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (charT[i] == '#') {
                if (tempT.length() > 0) tempT.deleteCharAt(tempT.length() - 1);
            } else {
                tempT.append(charT[i]);
            }
        }

        return Objects.equals(tempS.toString(), tempT.toString());
    }

}
