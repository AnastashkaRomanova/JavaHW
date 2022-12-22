package HW3;

import java.util.ArrayList;
import java.util.Arrays;

public class task7 {
    //Поиска элемента в списке по строке.
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Кот", "Собака", "Коза" ,"Корова", "Лошадь", "Петух"));
       
    System.out.println(list);
    int index = list.indexOf("Собака");
    System.out.println(index);
    }
    
}
