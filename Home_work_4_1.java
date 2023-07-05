
// 1) Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


import java.util.LinkedList;

public class  Home_work_4_1 {
    public static void main(String[] args) {
        
        int [] tempData = new int[] {2, 65,22, 49,345, 0, 9};
        LinkedList<Integer> dataList = fullList (tempData );
        System.out.println(dataList );
        System.out.println(mirrowList (dataList));
    }
    private static LinkedList<Integer> fullList (int[] array){
        LinkedList<Integer> fulledList = new LinkedList<Integer>();
        for (Integer element : array) {
            fulledList.add(element);
        }
        return fulledList;
    }
    private static LinkedList<Integer> mirrowList (LinkedList<Integer> dataList){
     LinkedList<Integer> resultList = new LinkedList<Integer>();
     for (int i =dataList.size()-1 ; i >=0; i--) {
        resultList.add(dataList.get(i));
     }  
     return  resultList;
    }
}
