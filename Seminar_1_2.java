import java.util.Scanner;

public class Seminar_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = scanner.nextLine();
        System.out.printf("Сколько вам лет: ");
        int age = scanner.nextInt();
        System.out.println("Привет, "+ name + "! Тебе же "+ age + " лет ?Ольга");
        scanner.close();
    }
}
