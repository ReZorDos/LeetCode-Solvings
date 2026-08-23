package need_to_refact.medium._48;

public class Main48 {

    public static void main(String[] args) {

    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            // Проходим по элементам текущего слоя (кроме последнего)
            for (int i = 0; i < right - left; i++) {
                int top = left;
                int bottom = right;

                // Сохраняем верхний левый элемент
                int topLeft = matrix[top][left + i];

                // Перемещаем нижний левый в верхний левый
                matrix[top][left + i] = matrix[bottom - i][left];

                // Перемещаем нижний правый в нижний левый
                matrix[bottom - i][left] = matrix[bottom][right - i];

                // Перемещаем верхний правый в нижний правый
                matrix[bottom][right - i] = matrix[top + i][right];

                // Перемещаем сохраненный верхний левый в верхний правый
                matrix[top + i][right] = topLeft;
            }

            // Переходим к следующему слою
            left++;
            right--;
        }
    }
}
