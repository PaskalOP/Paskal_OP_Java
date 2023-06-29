// 3) Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class Home_work_2_3 {
    public static void main(String[] args) {
        String str1 = "'фамилия':'Иванов','оценка':'5','предмет':'Математика'";
        String str2 = "'фамилия':'Петрова','оценка':'4','предмет':'Информатика'";
        String str3 = "'фамилия':'Краснов','оценка':'5','предмет':'Физика'";
        System.out.println(parserString(str1));
        System.out.println(parserString(str2));
        System.out.println(parserString(str3));
    }

    private static String parserString (String strData){
        
        StringBuilder result = new StringBuilder();
        int count = 1;
        String[] perseStr1 = strData.split(",");
        for (String element : perseStr1) {
            String[] tempList = element.split(":");
            if (count==1){
                result.append("Студент " + tempList[1].replace("'",""));
            }
            if (count==2){
                result.append(" получил " + tempList[1].replace("'",""));
            }
            if (count==3){
                result.append(" по предмету " + tempList[1].replace("'",""));
            }
            count++;
        }
        return result.toString();
    }
}
