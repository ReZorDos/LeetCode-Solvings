package easy._108_Convert_Sorted_Array_Binary_Search_Tree;

public class ConvertSortedArrayBinarySearchTree {
    public static void main(String[] args) {

    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return func(0, nums.length - 1, nums);
    }

    public static TreeNode func(int l, int r, int[] nums) {
        if (l > r) {
            return null;
        }
        int m = (l + r) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = func(l, m - 1, nums);
        root.right = func(m + 1, r, nums);
        return root;
    }
}
