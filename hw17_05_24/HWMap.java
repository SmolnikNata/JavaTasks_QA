package hw17_05_24;

import java.util.HashMap;
import java.util.Map;

public class HWMap {
    public static void main(String[] args) {
        //Есть Map, в котором храниться количество жителей по разным городам.
        //   - Найдите город с самым большим количеством жителей.
        //   - Найдите среднее количество жителей по всем городам.
        //   - * Найдите все города, у которых количество жителей одинаковое.
        Map<String, Integer> mapCity = new HashMap<>();
        mapCity.put("Hamburg", 1_841_179);
        mapCity.put("Berlin", 3_644_826);
        mapCity.put("Munich", 1_471_508);
        mapCity.put("Köln", 1_085_664);
        mapCity.put("Stutgard", 619_294);
        mapCity.put("Düsseldorf", 619_294);
        System.out.println(mapCity);

        // Найдите город с самым большим количеством жителей.
        String bigCity = null;
        int maxQuantity = 0;
        for (Map.Entry<String, Integer> entry : mapCity.entrySet()) {
            if (entry.getValue() > maxQuantity) {
                maxQuantity = entry.getValue();
                bigCity = entry.getKey();
            }
        }
        System.out.println("Самый большой город - " + bigCity);


        //- Найдите среднее количество жителей по всем городам.
        double sumQuantityPeople = 0;
        for (int peopleCity : mapCity.values()) {
            sumQuantityPeople += peopleCity;
        }
        System.out.println(" Среднее количество жителей по всем городам = " + sumQuantityPeople / (double) mapCity.size());

        //найдите все города, у которых количество жителей одинаковое.
//
//        for (Map.Entry<String, Integer> entry : mapCity.entrySet()) {
//            int quantity = entry.getValue();
//            String city = entry.getKey();
//
//            if (entry.getValue() =) {
//                maxQuantity = entry.getValue();
//                bigCity = entry.getKey();
//            }
//
//
//        }
   }
}
