package easy._70_Climing_Stairs;

public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(1));
    }

    public static int climbStairs(int n) {
        int one = 1;
        int two = 1;

        for (int i = 0; i < n - 1; i++) {
            int temp = one;
            one = one + two;
            two = temp;
        }
        return one;
    }
}
