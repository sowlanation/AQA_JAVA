package lesson_8_task_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class lesson8_task1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("cat");
        list.add("dog");
        list.add("tiger");
        list.add("lion");
        list.add("snake");
        list.add("pig");
        list.add("cat");
        list.add("dog");
        list.add("tiger");
        list.add("tiger");

        Set<String> uniqueList = new HashSet<String>(list);

        System.out.println("Введенный список: " + list);
        System.out.println("Уникальный список: " + uniqueList);
        System.out.println("Количество повторения для каждого элемента: ");

        for (String animals : uniqueList) {
            System.out.println(animals + ": " + Collections.frequency(list, animals));
        }
    }

}

