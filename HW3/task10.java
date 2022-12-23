package HW3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class task10 {
    //*Сортировка списка.
    public static void main(String[] args) {
        List<String> list= new ArrayList<String>();
        list.add("Blue");
        list.add("Red");
        list.add("Green");
        list.add("Yellow");
        list.add("Black");
        list.add("White");

        Collections.sort(list);
        System.out.println(list);
    
    

    ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(69, 54 , 58, 14 , 89 ,5 ,32 ,11));
    Collections.sort(arr);

    System.out.println(arr);



    }
}
