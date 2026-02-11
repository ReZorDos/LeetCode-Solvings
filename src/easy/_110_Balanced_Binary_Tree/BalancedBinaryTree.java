package easy._110_Balanced_Binary_Tree;

public class BalancedBinaryTree {
    public static void main(String[] args) {

    }

    public static boolean isBalanced(TreeNode root) {
        return func(root) != -1;
    }

    public static int func(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = func(node.left);
        if (left == -1) {
            return -1;
        }
        int right = func(node.right);
        if (right == -1) {
            return -1;
        }

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }
}
