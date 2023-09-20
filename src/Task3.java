import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір матриць (n): ");
        int n = scanner.nextInt();

        int[][] matrixA = new int[n][n];
        int[][] matrixB = new int[n][n];

        System.out.println("Введіть елементи матриці A:");
        inputMatrix(matrixA, scanner);

        System.out.println("Введіть елементи матриці B:");
        inputMatrix(matrixB, scanner);

        // Створення та виведення вектору X
        int[] vectorX = buildVectorX(matrixA, matrixB);

        System.out.println("Вектор X:");
        printVector(vectorX);
    }

    public static void inputMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Введіть елемент [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[] buildVectorX(int[][] matrixA, int[][] matrixB) {
        int n = matrixA.length;
        int[] vectorX = new int[n];

        for (int i = 0; i < n; i++) {
            boolean allNegative = true;
            for (int j = 0; j < n; j++) {
                if (matrixA[i][j] >= 0 || matrixB[i][j] >= 0) {
                    allNegative = false;
                    break;
                }
            }
            vectorX[i] = allNegative ? 1 : 0;
        }

        return vectorX;
    }

    public static void printVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("X[" + i + "] = " + vector[i]);
        }
    }
}