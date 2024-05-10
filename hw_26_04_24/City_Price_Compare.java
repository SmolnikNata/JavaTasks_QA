package hw_26_04_24;

import java.util.Comparator;

public class City_Price_Compare implements Comparator<House> {

    //Comparator<House> compareHausPriceCityAgeArea = new Comparator<House>() {// cщртируем по возрасту и весу
    @Override
    public int compare(House o1, House o2) {
        int cityCompare = o1.getCity().compareTo(o2.getCity());// сортируем строку через метод compareTo пл имени
        int priceCompare = o1.getPrice() - o2.getPrice();

        return cityCompare == 0 ? priceCompare  : cityCompare;


    }
}
