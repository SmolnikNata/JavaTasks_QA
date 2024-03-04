package zadachi;

import java.util.Scanner;

public class Task5 {
    //Определить, является ли треугольник со сторонами a, b, c равнобедренным.
    //Возможно ввести стороны треугольника и получить ответ
    //Число вводится с клавиатуры и выводится в консоль ответ
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = scanner.nextInt();
        System.out.println("Enter b number : ");
        int b = scanner.nextInt();

        if(a == b) System.out.println("Треугольник равнобедреный");
        else System.out.println("Треугольник не равнобедреный");

    }
}
