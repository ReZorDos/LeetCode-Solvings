package medium._71_Simplify_Path;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String path = "/home//foo/";
        System.out.println(simplifyPath(path));
    }

    public static String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String[] strings = path.split("/");

        for (String dir : strings) {
            if (dir.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else if (dir.isEmpty() || dir.equals(".")) {
                continue;
            } else {
                stack.push(dir);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append("/").append(stack.removeLast());
        }
        if(result.length() == 0) {
            result.append("/");
        }

        return result.toString();
    }
}
