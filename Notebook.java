
// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
//Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Notebook {
    String model; // модель ноутбука
    String color; // цвет ноутбука
    String screenDiagonal; // диагональ экрана 
    String operationSictem; // операционная система
    String memoryCard; //объем ЖД
    String operationMemory; //оперативная память
    String videoCard; // производитель видеокарты
    String [] allParams; // все параметры по порядку

    public Notebook (String model, String color, String videoCard, String operationSictem,String screenDiagonal, String memoryCard, String operationMemory){
        this.model = model;
        this.color = color; 
        this.screenDiagonal=screenDiagonal; 
        this.operationSictem = operationSictem; 
        this.memoryCard=memoryCard; 
        this.operationMemory = operationMemory; 
        this.videoCard = videoCard;
        this.allParams =  new String[]{model,color,screenDiagonal,operationSictem,operationMemory,memoryCard,videoCard};
    }   
    @Override
    public String toString (){
        return "Модель: " + model + "\nЦвет: " + color + "\nДиагональ экрана: " + screenDiagonal + "\nОперационная система:" 
        + operationSictem + "\nОбъем ЖД: " + memoryCard + "\nОперативная память: " + operationMemory + "\nПроизводитель видео карты: " + videoCard;
    }
    public HashMap <Integer,String> filterParametr (){
        HashMap <Integer,String> filterParams = new HashMap <Integer,String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Чтоб начать выбор критериев - нажмите 1");
        int continueInput = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" По какому критерию ищим модель? Выберите параметр и введите критерий: \n1- Модель ноутбука, \n2- Цвет ноутбука, \n3 - Диагональ экрана, \n4 - Операционная система, \n5 - Объем ЖД, \n6 - Оперативная память, \n7 - Производитель видео карты, \n - Чтоб закончить выбор, нажмите 0");
        String filterString; 
        int filterParam;
        while (continueInput !=0){
            System.out.println("Выбери номер критерия");
            filterParam = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Введи название критерия поиска");
            filterString = scanner.nextLine();
            filterParams.put(filterParam, filterString);
            System.out.println("Чтоб продолжить - нажмите 1! Чтоб закончить - нажми 0");
            continueInput = scanner.nextInt();
            scanner.nextLine();
        }
        
        scanner.close();
        return filterParams; 
    }

    public HashSet<Notebook> filterNoteBooks (ArrayList<Notebook> notebooks){
        HashSet<Notebook> notebooksList = new HashSet<>();
        HashMap <Integer,String> filterNum = filterParametr ();
        //int j =0;
        int k = 0;
        for (int i = 0; i< notebooks.size(); i++){
            while (k<allParams.length) {
                if(filterNum.containsKey(k+1)){
                    if(filterNum.get(k+1).equals(notebooks.get(i).allParams[k])){
                        notebooksList.add(notebooks.get(i));
                        k++;
                    }
                    else {
                        notebooksList.remove(notebooks.get(i));
                        break;

                    } 
                }
                else k++;
            }
            k=0;
        }
        return notebooksList;
    }


}
