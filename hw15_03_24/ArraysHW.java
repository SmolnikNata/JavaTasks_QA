package hw15_03_24;

import java.util.Arrays;

public class ArraysHW {
    //Посчитайте сумму элементов одномерного массива.
    public static void main(String[] args) {
        int[] array = {1, -3, 2, -4, 7, 9, 3, -10};

        System.out.println("Сумма элементов массива: " + sumElem(array));
        System.out.println("Произведение элементов массива: " + productPositivElem(array));

        System.out.println("Копия " + Arrays.toString(copyArrNegative(array)));
        chenge(array);
        System.out.println("Измененный массив:");
        System.out.print(Arrays.toString(array) + " ");

    }

    public static int sumElem(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    ////Посчитайте произведение положительных элементов одномерного массива:

    public static int productPositivElem(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                product *= arr[i];
            }
        }
        return product;
    }

    //  Создайте массив чисел. Замените все отрицательные значения на 0.

    public static void chenge(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
    }
    //Создайте массив чисел. Создайте его копию, которая будет содержать только
    // отрицательные значения из первого массива.
    public static int[] copyArrNegative(int[] arr) {  // Размер нового массива.выводим количествао негатив.юэлем в мвссиве
        int count = 0;  // счетчик негативных
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count ++;
            }
        }
        int[]arCopy = new int[count];   //создаем копию массива кодичеством,сколько насчитал счетчик
        int index =0;                   //начиная от нулевого индекса
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){               //проверяем
                arCopy[index] = arr[i];
                index ++;
            }
        }
        return arCopy;
    }
    //Создайте 2-х мерный массив. Посчитайте сумму всех парных элементов массива.
    //6) Реализуйте метод, который ищет значение в 2-х мерном массиве и возвращает индекс в виде [x][y].
    //7) Поменяйте местами значения первой строки 2-х мерного массива со значениями последней строки.
    //8) Создайте 2-х мерный массив. Осортируйте каждый из его подмассивов(строк) в порядке возрастания по отдельности.



}
