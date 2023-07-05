// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида
// text~num
// 2. Нужно рассплитить строку по ~, сохранить text в связный список на
// позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном
// списке и удаляет её из списка.

import java.util.LinkedList;
import java.util.Scanner;

public class Seminar_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку вида text~num: ");
       String userString = sc.nextLine();
        System.out.println(splitUserText (userString, sc));
        sc.close();
       
    }

    private static LinkedList<String> splitUserText ( String str, Scanner scan){
         LinkedList <String> resultLinkedList = new LinkedList <String> ();
         
         
         while(!str.equals("Esc")){
            String [] tempAr = str.split("~");
            int num = Integer.parseInt(tempAr[1]);
            if (num>resultLinkedList.size()){
            System.out.println("Несуществующая позиция");
            
            }
            else if (tempAr[0].equals("print")){
             System.out.println(resultLinkedList.get(num));
                resultLinkedList.remove(num);
                System.out.println(resultLinkedList.size());
            }
            else{
                resultLinkedList.add(num,tempAr[0]);
                System.out.println(resultLinkedList.size());
            }
                
            
            System.out.println("Введите строку вида text~num: ");
            str = scan.nextLine();
        }
         
        return resultLinkedList;
    }
}

