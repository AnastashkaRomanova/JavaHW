package HW2;

public class task2 {
    //Напишите программу, чтобы проверить,
    // являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
    public static void main(String[] args) {
        String a = "Напишите программу";
        String b = "уммаргорп етишипаН";
       

        String c = new StringBuilder(b).reverse().toString(); ///переворачиваем одну из строк
        System.out.println(c); //выводим в консоль перевернутую строку
        System.out.println(a.equals(c)); // сравниваем одну с результатом вращения второй
    }
}
