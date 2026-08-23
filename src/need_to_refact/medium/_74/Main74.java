package need_to_refact.medium._74;

public class Main74 {

    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int pot = matrix.length - 1;

        while (top <= pot) {
            int mid = (top + pot) / 2;
            if (matrix[mid][0] < target && matrix[mid][matrix[mid].length - 1] > target) {
                break;
            } else if (matrix[mid][0] > target) {
                pot = mid - 1;
            } else {
                top = mid + 1;
            }
        }

        int row = (top + pot) / 2;
        int left = 0;
        int right = matrix[row].length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }

}
