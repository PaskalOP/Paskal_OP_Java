
// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо 
// считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
//ПЛАН
// 1. Ключ - Имя, Значение - телефон
// 2. Второй телефон - конкнтинация строк
// 3. Вывод по длине строки значений
// 4. Обратная сортировка дерева

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Home_work_5 {
    public static void main(String[] args) {
       HashMap <String,String> phoneDict = inputData();
       System.out.println(printDict(phoneDict ));
       
    }

    private static HashMap <String,String> inputData (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для ввода данных нажмите 1! Для отмены ввода данных нажмите 0");
        int stopInput = scanner.nextInt();
        scanner.nextLine();
        HashMap <String,String> dataMap = new HashMap<>();
        while(stopInput!=0){
           System.out.println("Введите фамилию пользователя: ");
            String name = scanner.nextLine();

            System.out.println("Введите телeфон пользователя");
            String phone = scanner.nextLine();

            System.out.println("Продолжить вводить данные? Для отмены ввода данных нажмите 0");
            stopInput = scanner.nextInt();
            scanner.nextLine();
            if (!dataMap.containsKey(name)){
                dataMap.put(name, phone);
            }
            else{
                dataMap.put(name, dataMap.get(name) +phone);
            }
        }
        scanner.close();
        return dataMap ;

    }

     private static TreeMap<Integer,String> printDict (HashMap<String,String> dataDict){
        TreeMap<Integer,String> sortMap = new TreeMap<>();
        for (Map.Entry<String, String> element : dataDict.entrySet()) {
            int key = element.getValue().length();
            sortMap.put(key, element.toString());
        }
        TreeMap<Integer,String>  resultMap = new TreeMap<>(sortMap.descendingMap());
        return resultMap;
     }
}
