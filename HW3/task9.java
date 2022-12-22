package HW3;

import java.util.ArrayList;
import java.util.List;

public class task9 {
    //Удалить из первого списка все элементы отсутствующие во втором списке.

    public static void main(String[] args) {
        List<String> list= new ArrayList<String>();
        list.add("Blue");
        list.add("Red");
        list.add("Green");
        list.add("Yellow");
        list.add("Black");
        list.add("White");
    
        ArrayList<String> list2 = new ArrayList<String>(list.subList(2, 5));
        System.out.println(list2);
        list.retainAll(list2);
        System.out.println(list);
    }
    
}
