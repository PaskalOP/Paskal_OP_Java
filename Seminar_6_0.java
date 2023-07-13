// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5,
// 6, 3}. Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Seminar_6_0 {
    public static void main(String[] args) {
        
    HashSet<Integer> hashSet = getHashSet();
        LinkedHashSet<Integer> linkedSet = getLinkedSet();
        TreeSet<Integer> treeSet = getTreeSet();

        print(hashSet);
        System.out.println();
        print(linkedSet);
        System.out.println();
        print(treeSet);

    }

    private static void print(HashSet<Integer> set) {
        for (Object item : set) {
            System.out.print(item + " ");
        }
    }

    private static void print(LinkedHashSet<Integer> set) {
        for (Object item : set) {
            System.out.print(item + " ");
        }
    }

    private static void print(TreeSet<Integer> set) {
        for (Object item : set) {
            System.out.print(item + " ");
        }
    }

    private static HashSet<Integer> getHashSet() {
        // HashSet<Integer> set = new HashSet<>();
        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(2);
        // set.add(4);
        // set.add(5);
        // set.add(6);
        // set.add(3);

        HashSet<Integer> set = new HashSet<>(Arrays.asList(34, 6, 1, 3, 67, 5, 4, 2, 5, 9, -5));
        return set;
    }

    private static LinkedHashSet<Integer> getLinkedSet() {
        // LinkedHashSet<Integer> set = new LinkedHashSet<>();
        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(2);
        // set.add(4);
        // set.add(5);
        // set.add(6);
        // set.add(3);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(34, 6, 1, 3, 67, 5, 4, 2, 5, 9, -5));
        return set;
    }

    private static TreeSet<Integer> getTreeSet() {
        // TreeSet<Integer> set = new TreeSet<>();
        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(2);
        // set.add(4);
        // set.add(5);
        // set.add(6);
        // set.add(3);

        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(34, 6, 1, 3, 67, 5, 4, 2, 5, 9, -5));
        return set;
    }
    
}
