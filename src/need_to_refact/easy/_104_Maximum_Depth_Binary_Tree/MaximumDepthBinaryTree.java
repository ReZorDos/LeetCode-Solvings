package need_to_refact.easy._104_Maximum_Depth_Binary_Tree;

/*
Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 3

Example 2:
Input: root = [1,null,2]
Output: 2

Constraints:
The number of nodes in the tree is in the range [0, 104].
-100 <= Node.val <= 100
 */

public class MaximumDepthBinaryTree {
    public static void main(String[] args) {
        TreeNode tree5 = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7),
                                new TreeNode(2)
                        ),
                        null
                ),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4,
                                null,
                                new TreeNode(1)
                        )
                )
        );
        System.out.println(maxDepth(tree5));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return func(root, 0);
    }

    public static int func(TreeNode root, int value) {
        if (root == null) {
            return value;
        }
        int result = value + 1;
        return Math.max(func(root.left, result), func(root.right, result));
    }


    /*
    другое решение
     */
    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lheight = maxDepth2(root.left) + 1;
        int rheight = maxDepth2(root.right)+ 1;

        return Math.max(lheight,rheight);
    }
}
