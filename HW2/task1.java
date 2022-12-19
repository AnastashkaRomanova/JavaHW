package HW2;

import java.util.HashSet;

public class task1 {
    //Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).

    public static void main(String[] args) {
        String a = "Напишите программу";
        String b = "Напишите программу, которая содержит";
        System.out.println(containsAllChars(b, a));

    }

public static HashSet<Character> stringToCharacterSet(String s) {
    HashSet<Character> set = new HashSet<>();
    for (char c : s.toCharArray()) {
        set.add(c);
    }
    return set;
}
public static boolean containsAllChars
    (String str1, String str2) {
    return stringToCharacterSet(str1).containsAll
               (stringToCharacterSet(str2));
}
}