package homeWork_1;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число из промежутка: 2 < n < 100:");
        int n = in.nextInt();
        //объявление массива, в котором будут хранится первых n членов последовательности Фибоначчи
        int[] masFibonacci = new int[n];
        //первые два члена последовательности
        masFibonacci[0] = 0;
        masFibonacci[1] = 1;

        if (n == 2) System.out.println("Fibonacci (n = 2): 0  1");
        else {
            if (n > 2) {
                System.out.print("Fibonacci (n = "+n+"): ");
                int i = 2;
                while (i < n) {
                    masFibonacci[i] = masFibonacci[i - 1] + masFibonacci[i - 2];
                    i++;
                }
                //вывод в консоль массива
                for (int ii = 0; ii < n; ii++) {
                    System.out.print(masFibonacci[ii] + "  ");
                }
            }
        }

    }
}
