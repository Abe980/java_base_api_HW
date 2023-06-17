import Solution.Task1;
import Solution.Task2;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Object> lst = new LinkedList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);

        System.out.println("Task1");
        System.out.println(Task1.revLLst(lst));
        System.out.println();

        System.out.println("Task2");
        System.out.println("Add   " + Task2.enqueue(lst, 6));
        System.out.println("Del   " + Task2.dequeue(lst) + "   queue  " + lst);
        System.out.println("Get first   " + Task2.first(lst));
        System.out.println();
    }
}
