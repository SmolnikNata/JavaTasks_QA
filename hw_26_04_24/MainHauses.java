package hw_26_04_24;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainHauses {
    public static void main(String[] args) {

        // создаем дома
        House hause1 = new House(85,120_000, "Essen", true);
        House hause2 = new House(48,63_000, "Erenfeld",true);
        House hause3 = new House(35,48_000, "Essen", false);
        House hause4= new House(115,280_000, "Essen",true);
        House hause5 = new House(63,74_000, "Düsselddorf", false);

        List<House> houses = Arrays.asList(hause1, hause2, hause3, hause4, hause5);
        Collections.sort(houses);
        System.out.println("По прайсу " + houses );

        Collections.sort(houses, new City_Price_Compare());
        System.out.println("По городу и прайсу " + houses);

        Collections.sort(houses, new Area_City_Compare());
        System.out.println("По площади и городу");


    }
}
