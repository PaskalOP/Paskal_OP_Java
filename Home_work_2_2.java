
// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в 
//лог-файл.
// 4) К калькулятору из предыдущего ДЗ добавить логирование.

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;

public class Home_work_2_2 {
   
    
    public static void main(String[] args) throws IOException {
        int [] numArray = new int [] {5,7,12,-4,-76,7,94};
         Logger logger = Logger.getLogger(Home_work_2_2.class.getName());
         FileHandler fh = new FileHandler("logs.txt");
         logger.addHandler(fh);
         SimpleFormatter sFormate = new SimpleFormatter();
         fh.setFormatter(sFormate);
         printArray (sotrArray (numArray, logger));
    }

    private static int [] sotrArray (int [] nums, Logger logs){
        int temp;
        int count = 0;
        for (int i=0; i<nums.length-1; i++){
            for (int k=0; k<nums.length-1; k++){
                if(nums[k]>nums[k+1]){
                    temp = nums[k];
                    nums[k] = nums[k+1];
                    nums[k+1] = temp;
                    logs.info(" Меняем  " + nums[k] + " и " +nums[k+1]);
                }
                count++;
                logs.info(" Итерация номер  " + count );
            } 
        }
        return nums;
    }

    private static void printArray (int [] array){
        for (int element : array) {
            System.out.printf(element + ", ");
        }
    }
    
}
