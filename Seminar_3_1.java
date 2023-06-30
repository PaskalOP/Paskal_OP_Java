// 📌 Заполнить список десятью случайными числами.
// 📌 Отсортировать список методом sort() и вывести его на
// экран.

import java.util.ArrayList;
import java.util.Collections;

public class Seminar_3_1 {
    public static void main(String[] args) {
       int number = 10; 
       randomNumsSort(number);
    }

    private static void randomNumsSort (int num){
        ArrayList <Integer> listRandom = new ArrayList<Integer>();
        for (int index = 0; index < num; index++) {
            int number = (int) (Math.random()*100);
            listRandom.add(number);
        }
        Collections.sort(listRandom);
        System.out.println(listRandom);
    }
}
