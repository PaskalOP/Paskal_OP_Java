// Написать метод, который переведет число из римского формата записи в арабский.
// Например, MMXXII = 2022
// **I = 1**;
// **V = 5**;
// **X = 10**;
// **L = 50**;
// **C = 100**;
// **D = 500**;
// **M = 1000**.

import java.util.HashMap;
import java.util.Map;

public class Seminar_5_3 {
    public static void main(String[] args) {
        String data = "MMXXII";
        System.out.println(data + arabicDigit(data));
        
    }
    private static Map<Character,Integer> romanToArabic (){
    Map<Character,Integer> dict = new HashMap<>();
    dict .put('I', 1);
    dict .put('V', 5);
    dict .put('X', 10);
    dict .put('L', 50);
    dict .put('C', 100);
    dict .put('D', 500);
    dict .put('M', 1000);
    return dict;
    }

    private static Integer arabicDigit (String str){
        int result=0;
        Map<Character,Integer> arabDigit = romanToArabic();
        for (Character element : str.toCharArray()) {
            result += arabDigit.get(element); 
        }
        return result;
    }

}
