import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = Integer.parseInt(in.nextLine().split("\\s+")[0]);

        int[][] firstMatrix = readMatrix(rows, in);

        rows = Integer.parseInt(in.nextLine().split("\\s+")[0]);

        int[][] secondMatrix = readMatrix(rows, in);

        boolean areEqual = areEqual(firstMatrix, secondMatrix);

        String output = areEqual ? "equal" : "not equal";

        System.out.println(output);

    }

    private static boolean areEqual(int[][] firstMatrix, int[][] secondMatrix) {

        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            int[] firstArr = firstMatrix[row];
            int[] secondArr = secondMatrix[row];

            if (firstArr.length != secondArr.length) {
                return false;
            }

            for (int index = 0; index < firstArr.length; index++) {
                if (firstArr[index] != secondArr[index]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int[][] readMatrix(int rows, Scanner in) {
        int[][] matrix = new int[rows][];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(in.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }
}
