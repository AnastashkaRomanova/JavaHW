package HW2;

public class task5 {
    //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt()


    public static void main(String[] args) {
        
        String str = "Равенство это запись, в которой использован знак =";
        int index = str.indexOf("=");
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(index);
        System.out.println(sb.insert(index, "равно"));
    }
}
