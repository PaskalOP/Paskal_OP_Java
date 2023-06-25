
// 3) Реализовать простой калькулятор

import java.util.Scanner;

public class Home_work_1_3 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.printf("Введите первое число: ");
       int firstNum = scanner.nextInt();
        System.out.printf("Введите второе число: ");
       int secondNum = scanner.nextInt();
       System.out.println("Выберите необходимую операцию: \n Ecли хотите выбрать +, то нажмите 1\n Если хотите выбрать -, то нажмите 2,\n Если хотите выбрать *, то нажмите 3\n Если хотите выбрать /, то нажмите 4,\n ");
       int operationInt = scanner.nextInt();;

       scanner.close();
       int resaltOperation = operation(firstNum, secondNum,operationInt);
       System.out.println("Результат = " + resaltOperation);
    }
    private static int operation (int a, int b, int oper){
        int resalt = 0;
        switch (oper) {
            case 1:
                resalt = a+b;
                break;
            case 2:
                resalt = a-b;
                break;
            case 3:
                resalt = a*b;
                break;
            case 4:
                resalt = a/b;
                break;
            default:
                break;
        }
        return resalt;
    }
    
}
