package easy._205_Isomorphic_Strings;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "badc";
        String t = "title";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map1 = new HashMap<>();
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (!map1.containsKey(sChar[i])) {
                map1.put(sChar[i], tChar[i]);
            } else {
                if (map1.get(sChar[i]) != tChar[i]) {
                    return false;
                }
            }
        }

        HashMap<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (!map2.containsKey(tChar[i])) {
                map2.put(tChar[i], sChar[i]);
            } else {
                if (map2.get(tChar[i]) != sChar[i]) {
                    return false;
                }
            }
        }

        return true ;
    }

    public static boolean isIsomorphic2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map1 = new HashMap<>();
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (map1.containsKey(sChar[i])) {
                if (map1.get(sChar[i]) != tChar[i]) return false;
            } else if (map1.containsValue(tChar[i])) {
                return false;
            } else {
                map1.put(sChar[i], tChar[i]);
            }
        }

        return true ;
    }


}
