import java.util.Scanner;

class RemoveWordsOfOddLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст:");
        String inputText = scanner.nextLine();

        String[] words = inputText.split("[\\s\\p{Punct}]+");

        StringBuilder resultText = new StringBuilder();
        for (String word : words) {
            if (word.length() % 2 == 0) {
                resultText.append(word).append(" ");
            }
        }

        System.out.println("Результат:");
        System.out.println(resultText.toString().trim());
    }
}
