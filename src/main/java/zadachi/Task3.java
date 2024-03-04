package zadachi;

import java.util.Scanner;

public class Task3 {
    //Написать код. Число вводится с клавиатуры и выводится в консоль ответ
    //Дано двузначное число. Определить:
    //а) какая из его цифр больше: первая или вторая;
    //б) одинаковы ли его цифры.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a two-digit integer number : ");
        int num = scanner.nextInt();
        int first =  num/10;
        int second = num % 10;

        if(first >second) {
            System.out.println("1 is greater that 2");
        } else if (first < second) {
            System.out.println("1 is less that 2");
        } else {
            System.out.println("They are egual");
        }


    }
}
