package de.telran.hw1_Plakuschyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class homework1_220324 {
    public static void main(String[] args) {


        // 1) Найти сумму всех элементов ArrayList. Найти среднее значение элементов ArrayList.
        // Перебрать ArrayList и найти наименьший элемент. Перебрать ArrayList и найти сумму квадратов всех элементов.
        // *Перебрать ArrayList и удалить все четные числа. *Перебрать ArrayList и найти второй по величине элемент.

        List<Integer> arrList = Arrays.asList(2, 5, 8, 12, 4, 11, 5, 2, 3);
        System.out.println(sumElem(arrList));
        System.out.println(mindElem(arrList));
        System.out.println(minEl(arrList));
        System.out.println(sumOfSquares(arrList));
        System.out.println(delitEvenNum(arrList));

        List<Integer> arrList1 = Arrays.asList(2, 5, 8, 12, 4, 11, 5, 2, 3);
        System.out.println(secondBySize(arrList1));
    }

    public static int sumElem(List<Integer>arr){
        int sum = 0;
        for (int i = 0; i <arr.size() ; i++) {
            sum +=arr.get(i);
        }
        return sum;
    }

    public static int mindElem(List<Integer>aric){

        int mind =sumElem(aric)/aric.size();
        return mind;
    }
    public static int minEl(List<Integer>arrs){
        int min = arrs.get(0);
        for (int i = 0; i < arrs.size(); i++) {
          if( arrs.get(i)< min){
              min = arrs.get(i);
          }
        }
        return min;
    }
    public static int sumOfSquares(List<Integer>ar){
        int sum = 0;
        for (int i = 0; i <ar.size() ; i++) {
            sum += ar.get(i)*ar.get(i);
        }
        return sum;
    }
    public static List<Integer> delitEvenNum(List<Integer>as){
        List<Integer>newList = new ArrayList<>();
        for (int i = 0; i < as.size(); i++) {
            if(as.get(i)%2 !=0){
                newList.add(as.get(i));
            }
        }
        return newList;
    }
    public static int secondBySize(List<Integer>arl){
        List<Integer> newList = new ArrayList<>(arl);
        Collections.sort(newList);
        return newList.get(newList.size()-2);
        }

    }




