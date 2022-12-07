package java_hw4;

import java.util.Random;


public class task2 {
    public static void main(String[] args){
        queue someList = new queue();
        Random r = new Random();
        for (int i = 0; i < 10; i++){
            someList.enqueue(r.nextInt(100));
        }
        System.out.println("\nИсходный список");
        System.out.println(someList.list.toString());
        System.out.print("\nПервый элемент с удалением: ");
        System.out.println(someList.dequeue());
        System.out.println(someList.list.toString());
        System.out.print("\nПервый элемент без удаления: ");
        System.out.println(someList.first());
        System.out.println(someList.list.toString());
    }
}
