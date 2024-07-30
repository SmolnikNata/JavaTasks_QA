package HW24_05_24;

import java.util.function.Consumer;

public class FuncInterface {
    //1. Создание функционального интерфейса Printable:
    @FunctionalInterface
     interface Printable {
    void print(String text);
    }
    public static void main(String[] args) {
        //3.Замена интерфейса стандартным функциональным интерфейсом:

            Consumer<String> upperCasePrinter = (text) -> System.out.println(text.toUpperCase());
            Consumer<String> lowerCasePrinter = (text) -> System.out.println(text.toLowerCase());

            upperCasePrinter.accept("Hello, ALL!");
            lowerCasePrinter.accept("Hello, ALL!");
        }
    }


