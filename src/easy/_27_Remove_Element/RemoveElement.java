package easy._27_Remove_Element;

public class RemoveElement {
    public static void main(String[] args) {
        int[] ints = new int[] {3,2,2,3};
        System.out.println(removeElement(ints, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[result] = nums[i];
                result++;
            }
        }

        return result;
    }

}
