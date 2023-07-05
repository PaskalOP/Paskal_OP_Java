// 1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в
// очередь и выводит на консоль содержимое очереди.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Seminar_4_2 {
    public static void main(String[] args) {
        int[] arrayList = { 1, 4, 6, 7, 666, 2, 6, 8, 9, 333, 45, 7634567, 223, 4, 0 };
        printStack(arrayList);
        System.out.println();
        printQueue(arrayList);
    }

    public static void printStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        // for (Integer elem : stack) {
        // System.out.print(elem+" ");
        // }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }

    public static void printQueue(int[] arr) {
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
        // for (Integer element : queue) {
        // System.out.print(element+" ");
        // }
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
