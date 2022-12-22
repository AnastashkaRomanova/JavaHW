package HW3;

import java.util.ArrayList;
import java.util.Arrays;

public class task5 {
    //Обновить определенный элемент списка по заданному индексу.
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Кот", "Собака", "Корова", "Лошадь", "Петух"));
        System.out.println(list);
        list.set(2, "Свинья");
        System.out.println(list);
        
    }
    
}
