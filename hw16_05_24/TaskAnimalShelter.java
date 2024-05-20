package hw16_05_24;

import java.util.Map;
import java.util.TreeMap;

public class TaskAnimalShelter {
    public static void main(String[] args) {
//        У вас есть приют для животных, в которых живут коты.
//                Есть объект Cat с данными: имя, возраст, вес, порода.
//                - создайте Map, ключем которого будет имя, а значением объект Cat.
//                - информация о котах должна храниться в упорядоченном виде по имени.
//                - выведите имена котов, порода которых равна N (на ваше усмотрение).
//                - выведите список всех котов, вес которых больше значения М (на ваше усмотрение).
//        - * найдите кота с самым большим весом и возрастом одновременно.

        Map<String, Cats> mapCats = new TreeMap<>();

        mapCats.put("Bars", new Cats("Bars", 2, 1.8, "Breet"));
        mapCats.put("Kesha", new Cats("Kesha", 4, 2.1, "Dvor"));
        mapCats.put("Masyanya", new Cats("Masyanya", 7, 4, "Sphinks"));
        mapCats.put("Tom", new Cats("Tom", 12, 3.5, "Dvor"));
        mapCats.put("Nois", new Cats("Nois", 1, 1.3, "Siamese"));
        mapCats.put("Luisa", new Cats("Luisa", 5, 2.9, "Oriental"));

        String breedFind = "Dvor";

        for (Cats cat : mapCats.values()) {
            if (cat.getBreed().equals(breedFind)) {
                System.out.println("Имена котов породы 'Dvor' : " + cat.getName());
            }
        }

        for (Cats cat : mapCats.values()) {
            if (cat.getWeight() > 2) {
                System.out.println("Имена котов весом более 2 кг: " + cat.getName());
            }
        }

//        int weghtMax = 0;
//        int ageMax = 0;

        for (Cats cat : mapCats.values()) {
            if (cat.getWeight() > 3 && cat.getAge() >= 4) {
                System.out.println("Имена котов, чей вес более 3кг и возраст более 4 лет : " + cat.getName());

            }

        }
    }
}
