import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = Integer.parseInt(in.nextLine());

        int[][] matrix = readMatrix(size, in, "\\s+");

        int row = 0, col = 0;

        while (row < size && col < size) {
            int current = matrix[row][col];
            System.out.print(current + " ");
            row++;
            col++;
        }
        System.out.println();

        row = size - 1;
        col = 0;
        while (row >= 0 && col < size) {
            int current = matrix[row][col];
            System.out.print(current + " ");
            row--;
            col++;

        }

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
}
