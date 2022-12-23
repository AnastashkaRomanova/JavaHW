package HW3;

import java.util.ArrayList;
import java.util.Arrays;

public class task4 {
    //Извлечь элемент (по указанному индексу) из заданного списка
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Кот", "Собака", "Корова", "Лошадь", "Петух"));
        System.out.println(list);
        System.out.println(list.get(4));

    }
}
