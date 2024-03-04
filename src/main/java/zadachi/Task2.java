package zadachi;

import java.util.Scanner;

public class Task2 {
    //Написать код Число вводится с клавиатуры и выводится в консоль ответ
    //Если целое число m делится нацело на целое число n, то вывести
    // на экран ча-стное от деления, в противном случае вывести сообщение "m на n нацело не делится".

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer number m : ");
        int m = scanner.nextInt();
        System.out.println("Enter the integer number n : ");
        int n = scanner.nextInt();

        if (m % n == 0) {
            System.out.println(m / n);
        } else {
            System.out.println("m на n нацело не делится");

        }
    }
}
