// Задание №2.1
// 📌 Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// 📌 Вывести название каждой планеты и количество его
// повторений в списке.
//Меркурий, Венера, Земля, Марс, Юпитер, Сатурн, Уран, Нептун, Плутон.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Seminar_3_3 {
    public static void main(String[] args) {
        String [] dataPlanets = new String[] {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"};
        List <String> list1 = new ArrayList<String> ();
        Collections.addAll(list1, dataPlanets);

        List <String> list2 = randomList(list1);
        System.out.println(list2 );

        clearList(list2 );
        System.out.println(list2);
    }
    private static List<String> randomList (List <String> dataStr){
        List <String> list2 = new ArrayList<String>();
        for (int i =0; i<dataStr.size(); i++){
            int number = (int) (Math.random()*3);
            int count = 0;
            
            while(count<=number){
                list2.add(dataStr.get(i));
                count++;
                
            }
        }
        return list2;
    }

    private static void clearList (List <String> dataStr){
        for (int index = 0; index < dataStr.size(); index++) {
            for (int j=index+1; j<dataStr.size(); j++){
                if(dataStr.get(index).equals(dataStr.get(j))){
                   dataStr.remove(j) ;
                   j--;
                }
            }
            
        }
    }
}
