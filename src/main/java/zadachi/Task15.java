package zadachi;

public class Task15 {
    public static void main(String[] args) {


//    Задача 15
//    Дано слово  = “picture” . Получить и вывести на экран в консоль буквосочетание,
//    состоящее из его третьего и последнего символа

        String str = "picture";
        char cr = str.charAt(3);
        char cr1 = str.charAt(str.length()-1);

        System.out.println(" " + cr + cr1);


    }
}
