package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите 1 число: ");
            int x = in.nextInt();
            System.out.print("Введите 2 число: ");
            int n = in.nextInt();
            System.out.println(" НОД равняется: " + nod(x, n));
            System.out.println(" НОК равняется: " + nok(x, n));

        } catch (InputMismatchException e) {
            System.err.println("Введенное число не корректно!");
        }
    }

    private static int nod(int x, int n) {
        if (n == 0) {
            return x;
        } else {
            return nod(n, x % n);
        }
    }

    private static int nok(int x, int n) {
        return (x * n) / nod(x, n);
    }
}
