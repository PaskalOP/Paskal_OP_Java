
// 📌 Создать список типа ArrayList<String>.
// 📌 Поместить в него как строки, так и целые числа.
// 📌 Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;
import java.util.List;

public class Seminar_3_2 {
    public static void main(String[] args) {
        List <String> list1 = new ArrayList<String>();
        list1 .add(0,"1");
        list1.add(1,"4");
        list1.add(2,"test");
        removeDigits (list1);
        System.out.println(list1);

    }

    private static void removeDigits (List <String> dataList){
        for (int index = 0; index < dataList.size(); index++) {
            if(parsString (dataList.get(index))){
                dataList.remove(index);
                index--;
            }
        }
        
    }
    private static boolean parsString (String str){
        try {
            Integer.parseInt(str);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}

