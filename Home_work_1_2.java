// 2) Вывести все простые числа от 1 до 1000



public class Home_work_1_2 {
    public static void main(String[] args) {
        simpleDigits(1000);
    }
    public static void simpleDigits (int num){
        int count =0;
        for (int i = 2; i <= num; i++) {
            for (int j =2; j<=i; j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count<=1){
                System.out.printf(i + ", ");
                count =0;
            }
            count = 0;
        }
    }
}

