package zadachi;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        //Задача 11
        //Дано натуральное число.
        //а) Определить две его максимальные цифры.
        //б) Определить две его минимальные цифры.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int userNumb = scanner.nextInt();

        String numberString = String.valueOf(userNumb);
        char[] num = numberString.toCharArray(); // Преобразуем строку в массив символов для обработки
        // каждой цифры отдельно

        Arrays.sort(num);
        System.out.println("Две максимальные цифры: " + num[num.length - 1] + ", " + num[num.length - 2]);
        System.out.println("Две минимальные цифры: " + num[0] + ", " + num[1]);







    }
}
