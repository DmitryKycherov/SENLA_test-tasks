package task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = in.nextLine().toLowerCase();
        System.out.print("Введите слово: ");
        String word = in.nextLine().toLowerCase();
        System.out.println("Слово встречается: " + countOfOccurrences(text, word) + " раз(а)");
        in.close();

    }

    private static int countOfOccurrences(String text, String word) {

        String[] words = text.split(" ");

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (word.equalsIgnoreCase(words[i]))
                count++;
        }

        return count;
    }

}
