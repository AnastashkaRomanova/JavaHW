import java.util.ArrayList;

public class task4 {
    public static void main(String[] args) {
        //4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

        int n = 20;
        ArrayList<Integer> m2 = new ArrayList<>();
        for( int i= 10; i>=Short.MIN_VALUE; i++){
            if (i % n !=0)
            { 
                m2.add(i);
            }
        }
            System.out.println(m2);
        
    }
    
}
