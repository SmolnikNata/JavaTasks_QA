package de.telran.hw1_Plakuschyi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class homework2_220324 {
    public static void main(String[] args) {


        //2) Перебрать ArrayList и найти количество элементов, начинающихся с определенной буквы.
        // Перебрать ArrayList и объединить все элементы в одну строку.
        // Перебрать ArrayList и найти самую короткую строку.

        ArrayList<String> stingList = new ArrayList<>();
        stingList.add("зима");
        stingList.add("весна");
        stingList.add("лето");
        stingList.add("осень");
        stingList.add("времена");
        stingList.add("года");


        System.out.println(stingList);
        System.out.println(elemChar(stingList, 'в'));
        System.out.println(oneString(stingList));

        String shortestString = findShortestString(stingList);

        System.out.println("Самая короткая строка: " + shortestString);
    }

    public static int elemChar(List<String>listS,char firstCharWord){
        int count =0;
        for (String str:listS){
            if(str.charAt(0)==firstCharWord)
                count++;

        }
        return count;
    }

    public static String oneString(List<String>strArr){
        StringBuilder newStr = new StringBuilder();
        for (String elem:strArr) {
            newStr.append(elem);
        }
        return newStr.toString();
    }

    public static String findShortestString(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.isEmpty())
            return null;

        String shortest = arrayList.get(0);
        for (String elem : arrayList) {
            if (elem.length() < shortest.length()) {
                shortest = elem;
            }
        }
        return shortest;
    }

}

