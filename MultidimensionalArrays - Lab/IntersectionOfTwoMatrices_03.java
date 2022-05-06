import java.util.Scanner;

public class IntersectionOfTwoMatrices_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int rows = Integer.parseInt(in.nextLine());
        int cols = Integer.parseInt(in.nextLine());

        char[][] firstMatrix = readMatrix(rows, cols, in);
        char[][] secondMatrix = readMatrix(rows, cols, in);

        char[][] outputMatrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char fillChar = firstMatrix[row][col] ==
                        secondMatrix[row][col] ? firstMatrix[row][col] : '*';
                outputMatrix[row][col] = fillChar;

            }
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(outputMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] readMatrix(int rows, int cols, Scanner in) {
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String input = in.nextLine();
            String[] elements = input.split("\\s+");
            for (int i = 0; i < elements.length; i++) {
                char currentSymbol = elements[i].charAt(0);
                matrix[row][i] = currentSymbol;
            }
        }
        return matrix;
    }
}
