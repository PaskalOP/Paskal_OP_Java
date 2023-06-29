// 📌 Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).

public class Seminar_2_3 {
    public static void main(String[] args) {
        String dataStr = "ANNA";
        System.out.println(isPalindrom (dataStr));
    }
    private static boolean isPalindrom (String str){
        
        for (int index = 0; index < str.length()/2; index++) {
            if (str.charAt(index)!=str.charAt(str.length()-1-index)){
                return false;
            }
        }
        return true;
    }
}
