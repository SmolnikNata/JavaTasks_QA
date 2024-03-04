package zadachi;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //Составить программу, которая в зависимости от порядкового номера дня ме- сяца (1, 2, ..., 12)
        // выводит на экран время года, к которому относится этот месяц

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 12 : ");
        int user = scanner.nextInt();scanner.nextLine();
        String enumeration = switch (user){
            case 1 -> "yanuar";
            case 2 -> "februar";
            case 3 -> "marz";
            case 4 -> "april";
            case 5 -> "mai";
            case 6 -> "june";
            case 7 -> "july";
            case 8 -> "august";
            case 9 -> "september";
            case 10 -> "october";
            case 11-> "november";
            case 12 -> "december";
            default -> throw new RuntimeException("Недопустимый ввод");
        };
        System.out.println(enumeration);
    }
}
