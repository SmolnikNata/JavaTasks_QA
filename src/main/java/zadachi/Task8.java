package zadachi;

public class Task8 {
    //Задача 8
    //Одна штука некоторого товара стоит 20,4
    //Напечатать таблицу стоимости 2, 3, ..., 20 штук этого товара.
    public static void main(String[] args) {
        double price = 20.4;
        double sum = 0;
        for (int i = 2; i <=20; i++) {
            sum = i * price;
            System.out.println( i +" product: " + sum);


        }

    }
}
