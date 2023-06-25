

// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.
public class Seminar_1_4 {
    public static void main(String[] args) {
        int [] num  = new int[] {1,1,1,1,1,0,1,1,1};
        int count = 0;
        int maxCount = 0;
        for (int index = 0; index < num.length; index++) {
            if ( num[index]==1){
                count++;
            }
            else {
               if(maxCount <count){
                maxCount =count;
               }
                count=0;
            }
        }
        if (maxCount<count){
            maxCount =count;
        }
        System.out.println(maxCount);
    }
  
}
