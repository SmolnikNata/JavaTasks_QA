package hw_26_04_24;

import java.util.Objects;

public class House implements Comparable<House>{
    int area; //площадь дома
    int price; // цена
    String city; // город
    boolean hasFurniture; //продается с мебелью

    public House(int area, int price, String city, boolean hasFurniture) {
        this.area = area;
        this.price = price;
        this.city = city;
        this.hasFurniture = hasFurniture;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isHasFurniture() {
        return hasFurniture;
    }

    public void setHasFurniture(boolean hasFurniture) {
        this.hasFurniture = hasFurniture;
    }

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", price=" + price +
                ", city='" + city + '\'' +
                ", hasFurniture=" + hasFurniture +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return area == house.area && price == house.price && hasFurniture == house.hasFurniture && Objects.equals(city, house.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, price, city, hasFurniture);
    }

    @Override
    public int compareTo(House o) { //под капотом сравнивает и сортирует/
        if (this.price > o.price) {
            return 1;
        }
        if (this.price < o.price) {
            return -1;
        }
        // this.age == this.age)
        return 0;
    }

}
//ы автоматизируете бизнес риелторов. у вас есть класс:
//   public class House {
//       int area; //площадь дома
//       int price; // цена
//       String city; // город
//       boolean hasFurniture; //продается с мебелью
//   }
//По умолчанию в вашем информационном хранилище дома сортируются по цене.
//Но иногда клиент хочет видеть информацию о домах в конкретном городе и отсортированную по цене.
//Реализуйте компаратор, который вы можете применить для показа клиенту в требуемом им формате.
//А если клиенту неожиданно захочет увидеть информацию, отсортированную в формате:
//"город - площадь дома", что вы будете делать?
