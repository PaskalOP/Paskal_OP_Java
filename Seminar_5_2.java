// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Seminar_5_2 {
    public static void main(String[] args) {
        String str1 = "a+(d*3)";
        String str2 = "[a+(1*3)";
        String str3 = "[6+(3*3)]";
        String str4 = "{a}[+]{(d*3)}";
        String str5 = "{a}+{(d*3)}";
        String str6 = "{a+]}{(d*3)})";

        System.out.println(chackBrackets(str1));
        System.out.println(chackBrackets(str2));
        System.out.println(chackBrackets(str3));
        System.out.println(chackBrackets(str4));
        System.out.println(chackBrackets(str5));
        System.out.println(chackBrackets(str6));
    }

    private static boolean chackBrackets(String str){
    Map<Character,Character> brackets = new HashMap<Character,Character>();
    Stack<Character> stackCurrent = new Stack<>();
    
    brackets.put(')','(');
    brackets.put(']','[');
    brackets.put('}','{');
    brackets.put('>','<');

    for (Character oneBracket: str.toCharArray()) {
        if(brackets.containsValue(oneBracket)){
            stackCurrent.push(oneBracket);
        }
        else if (brackets.containsKey(oneBracket)){
            if (stackCurrent.isEmpty()||stackCurrent.pop()!=brackets.get(oneBracket)){
                return false;
            }
        }
    }
    return stackCurrent.isEmpty();
    };
    
}
