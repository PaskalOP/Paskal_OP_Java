// 📌 Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Seminar_2_4 {
    public static void main(String[] args) {
        String text = " TEST ";
        recorderFile(textbuilder(100, text ));
        
    }
    private static String textbuilder (int count, String str){
        StringBuilder sb = new StringBuilder();

        for (int index = 0; index < count; index++) {
            sb.append(str);
        }
        return sb.toString();
    }

    private static void recorderFile (String str){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", false))) {
            writer.write(str);
  
        }
        catch (IOException e)
        {
            System.out.println("Error" + e.getMessage());
        }
    }

}
