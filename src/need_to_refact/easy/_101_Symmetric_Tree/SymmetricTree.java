package need_to_refact.easy._101_Symmetric_Tree;

/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

Example 1:
Input: root = [1,2,2,3,4,4,3]
Output: true

Example 2:
Input: root = [1,2,2,null,3,null,3]
Output: false

Constraints:
The number of nodes in the tree is in the range [1, 1000].
-100 <= Node.val <= 100

 */
public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode rightLeaf1 = new TreeNode(3);
        TreeNode rightLeaf2 = new TreeNode(3);

        // Создаем левое поддерево: 2 с правым потомком 3
        TreeNode leftSubtree = new TreeNode(2, null, rightLeaf1);

        // Создаем правое поддерево: 2 с правым потомком 3
        TreeNode rightSubtree = new TreeNode(2, null, rightLeaf2);

        // Создаем корень
        TreeNode root = new TreeNode(1, leftSubtree, rightSubtree);

        TreeNode node = new TreeNode(1);

        System.out.println(isSymmetric(node));
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return function(root.left, root.right);
    }

    public static boolean function(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        }
        if (n1 == null || n2 == null) {
            return false;
        }
        if (n1.val != n2.val) {
            return false;
        }
        return function(n1.left, n2.right) && function(n1.right, n2.left);
    }
}
