package zadachi;

public class Task16 {
    public static void main(String[] args) {
        //Задача 16
        //Дано слово s1 = “meaning”  Получить слово s2, образованное нечетными буквами слова s1.
        String s1 = "meaning";
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 != 0) {
                s2.append((s1.charAt(i)));
            }
        }
        String s2B = s2.toString();

        System.out.println("" + s2B);


    }
}
