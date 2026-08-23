package need_to_refact.easy._111_Minimum_Depth_Binary_Tree;

/*
Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
Note: A leaf is a node with no children.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 2

Example 2:
Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5

Constraints:
The number of nodes in the tree is in the range [0, 105].
-1000 <= Node.val <= 1000
 */

public class MinimumDepthBinaryTree {
    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3, node4, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);

        System.out.println(minDepth(node1));
    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return func(root, 0);
    }

    public static int func(TreeNode root, int result) {
        if (root.left == null && root.right == null) {
            return result;
        }
        int value = result + 1;
        if (root.left == null) {
            return func(root.right, value) + 1;
        } else if (root.right == null) {
            return func(root.left, value) + 1;
        } else {
            return Math.min(func(root.left, value), func(root.right, value)) + 1;
        }
    }
}
