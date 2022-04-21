package lesson_8_task_2;

import java.util.*;

public class Phonebook {
    private final Map<String, HashSet<String>> map = new HashMap<>();

    void add(String surname, String phone) {
        HashSet<String> number = new HashSet<>();

        if (map.containsKey(surname)) {
            number = map.get(surname);
        }
        number.add(phone);
        map.put(surname, number);

    }

    Set<String> getPhoneNumber(String surname) {
        return map.get(surname);
    }

    @Override
    public String toString() {
        return "Список номеров из записной книжки : \n\t" + map;
    }
}
