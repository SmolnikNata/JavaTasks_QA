package zadachi;

import java.util.Scanner;

public class Task4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number : ");
            int num = scanner.nextInt();
            //Проверить, принадлежит ли число, введенное с клавиатуры, интервалу (–5, 3).

            if(num <= 3 && num >= -5) System.out.println("Число входит в диапазон от -5 до 3");
            else System.out.println("Число не входит в диапазон от -5 до 3");
    }

}
