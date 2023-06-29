// 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя 
//StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import java.util.Scanner;

public class Home_work_2_1 {
    public static void main(String[] args) {
        System.out.println("select * from students where: ");
        String resultString = DataUser();
        System.out.println(resultString);
    }
    private static String DataUser (){
        
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите имя пользователя: ");
        String name = scanner.nextLine();
        System.out.printf("Введите страну пользователя: ");
        String country = scanner.nextLine();
        System.out.printf("Введите город пользователя: ");
        String city = scanner.nextLine();
        System.out.printf("Введите возвраст пользователя: ");
        String age = scanner.nextLine();
        scanner.close();
        if (name.length()>0){
            sb.append("'name':" +  "'" +name +  "'");
        }
        if (country.length()>0){
            sb.append("'country':" +  "'" + country + "'");
        }
        if (city.length()>0){
            sb.append("'city':" +  "'"+ city+  "'");
        }
        if (age.length()>0){
            sb.append("'age':" +  "'"+ age+  "'");
        }
        return sb.toString();
        
    }
}
