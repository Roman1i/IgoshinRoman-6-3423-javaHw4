package java_hw4;

import java.util.LinkedList;


public class queue {
    public static LinkedList<Integer> list = new LinkedList<>();


    public static void enqueue(int num) {
        list.add(num);
    }

    public static int dequeue() {
        int first = list.getFirst();
        list.removeFirst();
        return first;
    }

    public static int first() {
        return list.getFirst();
    }
}