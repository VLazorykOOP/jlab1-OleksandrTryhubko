import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть a: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть b (більше за a): ");
        double b = scanner.nextDouble();

        System.out.print("Введіть кількість елементів масиву X(n): ");
        int n = scanner.nextInt();

        double[] X = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введіть X[" + i + "]: ");
            X[i] = scanner.nextDouble();
        }

        double sumXLessThanA = 0;
        double productXGreaterThanB = 1;
        double maxXInRange = X[0];
        double minXInRange = X[0];

        for (int i = 1; i < n; i++) {
            if (X[i] >= a && X[i] <= b) {
                maxXInRange = Math.max(maxXInRange, X[i]);
                minXInRange = Math.min(minXInRange, X[i]);
            }
        }


        for (int i = 0; i < n; i++) {
            if (X[i] < a) {
                sumXLessThanA += X[i];
            } else if (X[i] > b) {
                productXGreaterThanB *= X[i];
            }

            if (X[i] >= a && X[i] <= b) {
                maxXInRange = Math.max(maxXInRange, X[i]);
                minXInRange = Math.min(minXInRange, X[i]);
            }
        }

        System.out.println("Сума всіх X(i) < a: " + sumXLessThanA);
        System.out.println("Добуток всіх X(i) > b: " + productXGreaterThanB);
        System.out.println("Максимальне X(i) в діапазоні [a,b]: " + maxXInRange);
        System.out.println("Мінімальне X(i) в діапазоні [a,b]: " + minXInRange);
    }
}
