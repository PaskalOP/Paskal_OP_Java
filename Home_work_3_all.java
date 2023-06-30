
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Home_work_3_all {
    public static void main(String[] args) {
        int [] dataArray = new int[] {5, 8,10,3,57,4,15,5,9};

        int[] sortAr = margeSortArray(dataArray);
        System.out.println("Исходный массв:");
        printArray(dataArray );
        System.out.println();
        System.out.println("Отсортированный массив");
        printArray(sortAr); // Реализовать алгоритм сортировки слиянием #1
        System.out.println();
        // Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка. #2
       int min = sortAr[0];
       int max = sortAr[sortAr.length-1];
       int average = (min +max )/2;
       System.out.println("Минимальное значение массива = "+ min+ "\nМаксимальное значение массива = " + max +"\nСреднее арифметическое = "+ average );
       System.out.println("Лист с удаленными четными числами");
       System.out.println(removeEvenNumbers (dataArray)); //#3 Удаление четных
    }

    private static int [] margeSortArray (int [] startArray){
        if (startArray.length<=1)  {
            return startArray;
        }   
        int [] firstrAr  = Arrays.copyOfRange(startArray, 0, startArray.length / 2);
        int [] secondAr = Arrays.copyOfRange(startArray, firstrAr .length, startArray.length );
        return margeArray(margeSortArray(firstrAr), margeSortArray(secondAr ));

    }

    private static int [] margeArray (int []firstPart, int [] secondPart){
        int [] resultArray =  new int [firstPart.length + secondPart.length];
        int countFirstAr = 0;
        int countSecondAr = 0;
        int countResultAr = 0;

        while(countFirstAr<firstPart.length&&countSecondAr<secondPart.length){
            if(firstPart[countFirstAr]<secondPart[countSecondAr]){
                resultArray[countResultAr] = firstPart[countFirstAr];
                countResultAr++;
                
                countFirstAr++;
            }
            else{
                resultArray[countResultAr] = secondPart[countSecondAr];
                countResultAr++;
                countSecondAr++;
            }
        }    
        while (countResultAr<resultArray.length) {
            if(countFirstAr!=firstPart.length){
                resultArray[countResultAr]=firstPart[countFirstAr];
                countResultAr++;
                countFirstAr++;
            }
            else{
                resultArray[countResultAr] = secondPart[countSecondAr];
                countResultAr++;
                countSecondAr++;
            }
        }
        return resultArray;        
            
        
    }    
    private static void printArray (int [] dataArr){
        for (int element : dataArr) {
            System.out.printf(element + ", ");
        }
    }
// Пусть дан произвольный список целых чисел, удалить из него четные числа
    private static List <Integer>  removeEvenNumbers (int[] arr){
        List <Integer> resultList = new ArrayList<Integer> ();
        Integer [] tempList = new Integer[arr.length];
        for (int i=0; i<arr.length; i++) {
            tempList[i]=arr[i];
        }
        Collections.addAll(resultList, tempList);

        for (int j=0; j<resultList.size(); j++){
            if (resultList.get(j)%2==0){
               resultList.remove(j);
               j--;
            }
        }
        return resultList; 
    }
}
