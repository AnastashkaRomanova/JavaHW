package HW3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task2 {
   // Итерация всех элементов списка цветов и добавления к каждому символа '!'.
   public static void main(String[] args) {
    List<String> list= new ArrayList<String>();
    list.add("Blue");
    list.add("Red");
    list.add("Green");
    list.add("Yellow");

    Iterator<String> colors = list.iterator();
    while(colors.hasNext()) {
        String i = colors.next(); 
        System.out.println(i + "!");      
    }
    

   }
    
}
