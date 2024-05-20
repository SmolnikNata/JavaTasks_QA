package hw16_05_24;

import java.util.HashMap;
import java.util.Map;

public class TicketListMap {
    public static void main(String[] args) {
//        Найти маршрут из заданного списка билетов, желательно используя Map.
//        Учитывая список билетов, найти маршрут по порядку, используя данный список.
//        Вход:
//        «Berlin» -> «London»
//        «Tokyo» -> «Seoul»
//        «Mumbai» -> «Berlin»
//        «Seoul» -> «Mumbai»
//        Выход:
//        Tokyo->Seoul, Seoul->Mumbai, Mumbai->Berlin, Berlin->London

        Map<String, String> routes = new HashMap<>();
        routes.put("Berlin", "London");
        routes.put("Tokyo", "Seoul");
        routes.put("Mumbai", "Berlin");
        routes.put("Seoul", "Mumbai");

        // T -> S -> M -> B -> L

        for (Map.Entry<String, String> rout : routes.entrySet()) {
            String start = rout.getKey();
            String finish = rout.getValue();
            if (!routes.containsValue(start)) {
                System.out.println("Start point is " + start);

            }
            else if (!routes.containsKey(finish)){
                System.out.println(("Finish is " + finish));
            }
        }
    }

}
