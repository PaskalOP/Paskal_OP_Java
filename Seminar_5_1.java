// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
// и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
// некоторую букву во втором слове, при этом
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
// порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true

import java.util.HashMap;
import java.util.Map;

public class Seminar_5_1 {
    public static void main(String[] args) {
        // String str1 = "foo";
        // String str2 = "bar";
        // String str1 = "paper";
        // String str2 = "title";
        // String str1 = "note";
        // String str2 = "code";
        String str2 = "foo";
        String str1 = "bar";
        System.out.println(isIzomorf(str1,str2));
        
    }

    private static boolean isIzomorf(String string1, String string2){
        if(string1.equals(string2)) return true;
        if (string1.length()!= string2.length()) return false;
        
        Map <Character, Character> dataWords = new HashMap<>();
        for (int i = 0; i < string1.length(); i++) {
            char char1 = string1.charAt(i);
            char char2 = string2.charAt(i);
            if(!dataWords.containsKey(char1)){
                dataWords.put(char1, char2);
            }
            else{
                if(dataWords.get(char1)!=char2){
                    return false;
                }
            }
            
        }
        return true;
        
    }
}
