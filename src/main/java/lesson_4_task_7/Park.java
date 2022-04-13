package lesson_4_task_7;

import java.util.ArrayList;
import java.util.List;

public class Park {
    List<Attraction> attractions = new ArrayList<Attraction>() {
        {
            add(new Attraction("Ромашка", "25.04.2022 10:00", "25.04.2022 20:00", 200));
            add(new Attraction("Сюрпиз", "26.04.2022 11:00", "26.04.2022 22:00", 300));
            add(new Attraction("Поровозик", "27.04.2022 12:00", "27.04.2022 17:30", 280));
            add(new Attraction("Горки", "25.04.2022 09:00", "25.04.2022 22:45", 1000));
            add(new Attraction("Гонки", "30.04.2022 10:00", "30.04.2022 20:00", 2500));
        }
    };

    public static class Attraction {
        String name;
        String dateFrom;
        String dateTo;
        int price;

        public Attraction(String name, String dateFrom, String dateTo, int price) {
            this.name = name;
            this.dateFrom = dateFrom;
            this.dateTo = dateTo;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", dateFrom='" + dateFrom + '\'' +
                    ", dateTo='" + dateTo + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    @Override
    public String toString() {
        String str = "Park{\n\tattractions=";
        for (Attraction result : attractions) {
            str += "\n\t\t" + result;
        }
        return str + "\n}";
    }
}
