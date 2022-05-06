import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = Integer.parseInt(in.nextLine());

        int[][] matrix = readMatrix(rows, in, "\\s+");

        int wrongNumberRow = in.nextInt();
        int wrongNumberCol = in.nextInt();
        int wrongNumber = matrix[wrongNumberRow][wrongNumberCol];

        int[][] newMatrix = fixMatrix(matrix, wrongNumber);

        printMatrix(newMatrix);


    }

    public static int[][] fixMatrix(int[][] matrix, int wrongNumber) {
        int rows = matrix.length;
        int[][] newMatrix = new int[rows][matrix[rows - 1].length];
        int sum;
        for (int row = 0; row < rows; row++) {
            int cols = matrix[row].length;
            for (int col = 0; col < cols; col++) {
                int currentNumber = matrix[row][col];
                if (wrongNumber == currentNumber) {
                    sum = 0;

                    if ((row - 1) >= 0) {
                        int upInt = matrix[row - 1][col];
                        if (upInt != currentNumber) {
                            sum += upInt;
                        }
                    }

                    if ((row + 1) < matrix.length) {
                        int downInt = matrix[row + 1][col];
                        if (downInt != currentNumber) {
                            sum += downInt;
                        }
                    }
                    if ((col - 1) >= 0) {
                        int leftInt = matrix[row][col - 1];
                        if (leftInt != currentNumber) {
                            sum += leftInt;
                        }
                    }
                    if ((col + 1) < matrix[row].length) {
                        int rightInt = matrix[row][col + 1];
                        if (rightInt != currentNumber) {
                            sum += rightInt;
                        }
                    }
                    newMatrix[row][col] = sum;
                } else {
                    newMatrix[row][col] = matrix[row][col];
                }
            }
        }
        return newMatrix;
    }


    public static int[][] readMatrix(int rows, Scanner in, String splitPattern) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(in.nextLine()
                            .split(splitPattern))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        for (int row = 0; row < rows; row++) {
            int cols = matrix[row].length;
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
