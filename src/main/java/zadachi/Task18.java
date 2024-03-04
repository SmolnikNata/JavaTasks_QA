package zadachi;

public class Task18 {
    public static void main(String[] args) {

        //Проверить, заканчивается ли строка  “first meaning in the row” подстрокой “!!!”.  Вывести yes/no

        String str = "first meaning in the row";
        String substring = "!!!";
        boolean withSubStr = str.endsWith(substring);

            if(withSubStr)
                System.out.println("yes");
            else System.out.println("no");

    }
}