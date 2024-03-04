package zadachi;

public class Task17 {
    public static void main(String[] args) {
        //Дано предложение “Первая буква алфавита всегда – а”
        //Определить, есть ли буква а в нем. В случае положительного ответа
        // найти также порядковый номер первой из них.
        String sentence = "Первая буква алфавита всегда – а";
        char targetChar = 'а'; // буква "а" в кириллице
        int index = -1;
        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == targetChar) {
                index = i + 1;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Буква 'а' найдена в предложении на позиции: " + index);
        } else {
            System.out.println("Буква 'а' не найдена в предложении.");
        }
    }
}