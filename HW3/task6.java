package HW3;

import java.util.ArrayList;
import java.util.Arrays;

public class task6 {
    //Удалить третий элемент из списка.
    public static void main(String[] args) {
        
    
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("Кот", "Собака", "Коза" ,"Корова", "Лошадь", "Петух"));
       
    System.out.println(list);
    list.remove(2);
    System.out.println(list);
}
}
