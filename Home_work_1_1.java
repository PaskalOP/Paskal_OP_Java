
// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Home_work_1_1 {
    public static void main(String[] args) {
        int n = 5;
        int sumDigit = sumNumbers(n);
        int multip = multiplNumbers(n);
        System.out.println("Сумма чисел до n  = " + sumDigit);
        System.out.println("Произведение чисел до n  = " +  multip);

    }
    private static int sumNumbers (int num){
        return num==0? 0 : num+sumNumbers(num-1); 
      
    }
     private static int multiplNumbers (int num){
        return num==1? 1 : num * multiplNumbers(num-1); 
      
    }
}
