package zadachi;

public class Task1 {
    // В трехзначном числе x зачеркнули его вторую цифру. Когда к образованному
    // при этом двузначному числу слева приписали вторую цифру числа x, то полу- чилось число 546.
    // Найти число x.
    public static void main(String[] args) {
        int newNumber = 546;

        // Получаем вторую цифру числа
        int secondNum = (newNumber / 10) % 10;
        System.out.println(secondNum);

        // Получаем последнюю цифру числа
        int nextNum = newNumber % 10;
        System.out.println(nextNum);

        // Известное число после затирания цифры без учета второй цифры
        int newX = nextNum * 100 + secondNum * 10 + nextNum;

        System.out.println("Число x: " + newX);

    }

}
