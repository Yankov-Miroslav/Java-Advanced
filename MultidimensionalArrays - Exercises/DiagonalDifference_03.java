import java.util.Scanner;

public class DiagonalDifference_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[][] matrix = new int[n][n];

        //fill Matrix
        fillMatrix(in, matrix);
        //sum Primary
        int sumPrimary = getSumPrimaryDiagonal(matrix);
        //sum Secondary
        int sumSecondary = getSumSecondaryDiagonal(matrix);
        //abs(sumPrimary - sumSecondary)
        System.out.println(Math.abs(sumPrimary - sumSecondary));


    }

    private static int getSumSecondaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (col == matrix.length - row - 1) {
                    sum += matrix[row][col];
                }
            }
        }
        return sum;
    }

    private static int getSumPrimaryDiagonal(int[][] matrix) {
        //обхождаме всички елементи -> сумираме само ако ред == колоната
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (row == col) {
                    sum += matrix[row][col];
                }
            }
        }
        return sum;
    }

    private static void fillMatrix(Scanner scanner, int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }


}
