package java_hw4;

import java.util.LinkedList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
         Random r = new Random();

        for (int i = 0; i < 10; i++) {
            ll.add(r.nextInt(100));
        }

        System.out.println("\nИсходный список");
        System.out.println(ll);
        System.out.println("\nПеревернутый список");
        System.out.println(reverseList(ll));
    }

    public static LinkedList<Integer> reverseList(LinkedList<Integer> ll) {
        LinkedList<Integer> llReverse = new LinkedList<>();
        for (int i = 0; i < ll.size(); i++) {
            llReverse.add(ll.get(ll.size()-i-1));
        } return llReverse;
    }
}
