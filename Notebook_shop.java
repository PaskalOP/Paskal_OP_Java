import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Notebook_shop {
    public static void main(String[] args) {
        Notebook noteBook1 = new Notebook ("MacBook", "grey", "Intel", "IOS", "16.4", "254", "28");
        Notebook noteBook2 = new Notebook ("MacBook", "black", "Intel", "IOS", "16.4", "254", "28");
        Notebook noteBook3 = new Notebook ("Asus", "black", "Intel", "Windows", "16.4", "254", "28");
        Notebook noteBook4 = new Notebook ("Asus", "grey", "Intel", "Windows", "16.4", "254", "28");
        ArrayList <Notebook> notebooks = new ArrayList<Notebook>();
        notebooks.add (noteBook1);
        notebooks.add (noteBook2);
        notebooks.add (noteBook3);
        notebooks.add (noteBook4);
        //System.out.println(noteBook1.toString());
        //int paramFilter = noteBook1.filterParametr();
        HashSet <Notebook> filteNnotebooks = noteBook1.filterNoteBooks(notebooks);
        System.out.println(filteNnotebooks);
    }
}
