package task3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите слова одной строкой через пробел");
        String str = in.nextLine();
        String[] arr = str.split(" ");
        System.out.println("Количество слов: " + arr.length);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
        }
        System.out.println(Arrays.toString(arr));
        in.close();
    }
}
