package HW3;

import java.util.ArrayList;

public class task3 {
    //Вставить элемент в список в первой позиции
    public static void main(String[] args) {
        
    ArrayList<String> list= new ArrayList<String>();
    list.add("Blue");
    list.add("Red");
    list.add("Green");
    list.add("Yellow");

    System.out.println(list);
    list.add(0, "Black");
    System.out.println(list);
    }

    
}
