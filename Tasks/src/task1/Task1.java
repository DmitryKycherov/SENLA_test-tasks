package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите целое число: ");
            int num = in.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " - число четное");
            } else {
                System.out.println(num + " - число нечетное");
            }
            if (isPrime(num)) {
                System.out.println(num + " - простое число");
            } else {
                System.out.println(num + " - составное число");
            }

        } catch (InputMismatchException e) {
            System.err.println("Введенное число не корректно!");
        }
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
