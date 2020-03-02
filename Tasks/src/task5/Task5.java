package task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите конец массива:");
        int num = Integer.parseInt(reader.readLine());
        if (num > 100) {
            System.out.print("Число не должно превышать 100");
        } else {
            palindromeSequence(num);
        }
    }

    private static void palindromeSequence(int num) {
        for (int i = 0; i < num; i++) {
            int ch = i / 10;
            int cr = i % 10;
            if ((ch == (i - ch) / 10 && (i - ch) % 10 == 0) || (cr == i)) {
                System.out.print(i + " ");
            }
        }
    }
}
