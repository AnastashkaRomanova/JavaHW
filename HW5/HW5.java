package HW5;

import java.util.HashMap;
import java.util.Set;

public class HW5 {
//     Создать словарь HashMap. Обобщение <Integer, String>.
// Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключь, если не было!)
// Изменить значения сделав пол большой буквой.
// Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
// *Сортировать значения по возрасту и вывести отсортированную коллекция как в четвёртом пункте.
    
  
 
/**
 * @param args
 */
public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();

        map.put(0, "Иванов Иван Иванович 38 м");
        map.put(1, "Иванцов Петр Петрович 26 м");
        map.put(2, "Андреев Артем Сидорович 30 м");
        map.put(3, "Соколов Петр Андреевич 45 м");
        map.put(4, "Коровина Наталья Васильевна 65 ж");

        
        Set<Integer> keys= map.keySet();

            for (Integer key: keys){
                String[] arr = map.get(key).split(" ");
                String tmp1 = arr[0].toUpperCase().charAt(0)+arr[0].toLowerCase().substring(1,arr[0].length());
                String tmp2 = arr[1].toUpperCase().charAt(0)+".";
                String tmp3 = arr[2].toUpperCase().charAt(0)+".";
                String tmp4 = arr[3];
                String tmp5 = arr[4].toUpperCase();
                String tmp = tmp1 + " "+ tmp2 + tmp3+" "+tmp4+"  "+tmp5;

                System.out.println(tmp); 

            }
       

   }
}
