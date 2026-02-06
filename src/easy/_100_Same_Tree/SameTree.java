package easy._100_Same_Tree;

public class SameTree {
    public static void main(String[] args) {
/*        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node1 = new TreeNode(1, node2, node3);
        TreeNode node6 = new TreeNode(2);
        TreeNode node5 = new TreeNode(3);
        TreeNode node4 = new TreeNode(1, node5, node6);

        System.out.println(isSameTree(node1, node4));*/
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
