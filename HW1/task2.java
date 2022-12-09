package HW1;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        //2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
    
        int i;
        Random random = new Random();  
        i = random.nextInt(2001); 
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i)); 
        System.out.println(Integer.toBinaryString(i).length());      
       


    }
}    
     
   
    


    

