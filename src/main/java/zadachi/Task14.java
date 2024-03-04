package zadachi;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        // Дано слово. Вывести на экран его третий символ. Слово вводится с клавиатуры
        // / вывод консоль
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = scanner.nextLine();
        char ch = word.charAt(3);
        System.out.println(ch);

    }
}

