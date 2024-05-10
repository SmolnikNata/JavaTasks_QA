package hw_26_04_24;

import java.util.Comparator;

public class Area_City_Compare implements Comparator<House> {

    @Override
    public int compare(House o1, House o2) {
        int cityCompare = o1.getCity().compareTo(o2.getCity());// сортируем строку через метод compareTo пл имени
        int areaCompare = o1.getArea() - o2.getArea();

        return cityCompare == 0 ? areaCompare : cityCompare;
    }
}


