import java.util.Scanner;

public class SumMatrixElements_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        System.out.println(rows);
        int cols = Integer.parseInt(input[1]);
        System.out.println(cols);
        int[][] matrix = readMatrix(rows, cols, in);
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int currentDigit = (matrix[i][j]);
                sum += currentDigit;
            }
        }
        System.out.println(sum);
    }

    public static int[][] readMatrix(int rows, int cols, Scanner in) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String input = in.nextLine();
            String[] elements = input.split(", ");
            for (int i = 0; i < elements.length; i++) {
                int currentSymbol = Integer.parseInt(elements[i]);
                matrix[row][i] = currentSymbol;
            }
        }
        return matrix;
    }
}