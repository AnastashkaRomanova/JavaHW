package HW3;

import java.util.ArrayList;
import java.util.Arrays;

public class task1 {
    //Создать новый список, добавить несколько строк и вывести коллекцию на экран.

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Крошка!"));
        list.add("С");
        list.add("Новым");
        list.add("Годом");
        list.add("!");
        System.out.println(list);
    }
    
}
