package zadachi;

import java.util.Scanner;

public class Task9 {
    //Задача 9
    //Среди чисел 1, 4, 9, 16, 25, ... найти первое число, большее n.
    //N  вводим с клавиатуры – ответ выводим
    public static void main(String[] args) {
        int[] arr = {1, 4, 9, 25, 36, 47, 119, 120};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number bis 120");
        int userNumb = scanner.nextInt();
        int findNum = findNumber(arr,userNumb);
        System.out.println(findNum);
    }
    public static int findNumber(int[]array,int n) {
        for (int number: array) {
            if (number>n) {
                return number;
            }
        }
        return -1;
    }
}
