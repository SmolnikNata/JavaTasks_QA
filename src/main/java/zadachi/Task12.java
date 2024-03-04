package zadachi;

public class Task12 {
    public static void main(String[] args) {
//        Дано натуральное число. Установить, является ли последовательность его цифр при просмотре
//        их слева направо упорядоченной по возрастанию.
//        Например, для числа 1478 ответ положительный, для чисел 1782 и 1668 — отрицательный и т. п.

        int number = 1987456;

        String numString = String.valueOf(number);
        boolean isAscending = true;
        for (int i = 0; i < numString.length() - 1; i++) {

            if (numString.charAt(i) > numString.charAt(i + 1)){
                isAscending = false;
                break;
            }
        }
        System.out.println(isAscending);

    }
}
