package HW2;

public class task4 {
    //Дано два числа, например 3 и 56,
    // необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 
    //Используем метод StringBuilder.append().
    public static void main(String[] args) {
        
    

    Integer a = 3;
    Integer b = 56;
    Integer res1 = a+b;
    Integer res2 = a-b;
    Integer res3 = a*b;

    
    StringBuilder str1 = new StringBuilder();
    StringBuilder str2 = new StringBuilder();
    StringBuilder str3 = new StringBuilder();



    str1.append(a.toString());
    str1.append("+");
    str1.append(b.toString());
    str1.append("=");
    str1.append(res1.toString());

    str2.append(a.toString());
    str2.append("-");
    str2.append(b.toString());
    str2.append("=");
    str2.append(res2.toString());

    str3.append(a.toString());
    str3.append("*");
    str3.append(b.toString());
    str3.append("=");
    str3.append(res3.toString());



    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
}
}