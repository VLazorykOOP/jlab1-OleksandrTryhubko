import java.util.Scanner;

class ExpressionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Варіант 1: Введіть значення x (дійсне): ");
        double x1 = scanner.nextDouble();
        System.out.println("Введіть значення y (дійсне): ");
        double y1 = scanner.nextDouble();
        double result1 = calculateExpression(x1, y1);
        System.out.println("Результат: " + result1);

        System.out.println("Варіант 2: Введіть значення x (ціле): ");
        int x2 = scanner.nextInt();
        System.out.println("Введіть значення y (ціле): ");
        int y2 = scanner.nextInt();
        double result2 = calculateExpression(x2, y2);
        System.out.println("Результат: " + result2);

        System.out.println("Варіант 3: Введіть значення x (дійсне): ");
        double x3 = scanner.nextDouble();
        System.out.println("Введіть значення y (дійсне): ");
        double y3 = scanner.nextDouble();
        int result3 = (int) Math.round(calculateExpression(x3, y3));
        System.out.println("Результат: " + result3);

        scanner.close();
    }

    public static double calculateExpression(double x, double y) {
        double term1 = (2 * x * x + x * y) / Math.pow(x * y, 2);
        double term2 = (3 * x * y - Math.pow(y, 3)) / (x * x + 2 * y * y);
        return term1 + term2;
    }
}
