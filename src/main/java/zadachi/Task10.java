package zadachi;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        //Задача 10
        //Дано натуральное число. Определить, сколько раз в нем встречается первая цифра.
        //Число вводится с клавиатуры и выводится в консоль ответ
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int userNumb = scanner.nextInt();
        int count = 0;

        String numberStr = String.valueOf(userNumb);
        char firstNumb  = numberStr.charAt(0);

        for (int i = 0; i < numberStr.length() ; i++) {
            if(numberStr.charAt(i) == firstNumb){
                count++;
            }
        }
        System.out.println( "Цифра встречается " + count + " раз");

    }
}
