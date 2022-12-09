import java.util.ArrayList;

public class task3 {
    public static void main(String[] args) {
        //3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

        int i = 5;
        int n = 320;
        ArrayList<Integer> m1 = new ArrayList<Integer>();
        for( i= 5; i<= Short.MAX_VALUE; i++){
            if (i%n==0)
            { 
                m1.add(i);
            }
        }
            System.out.println(m1);
        


        
        
    }
    
}
