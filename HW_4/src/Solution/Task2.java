package Solution;

import java.util.LinkedList;

public class Task2 {
    // Реализуйте очередь с помощью LinkedList со следующими методами:
    // enqueue() - помещает элемент в конец очереди, 
    // dequeue() - возвращает первый элемент из очереди и удаляет его, 
    // first() - возвращает первый элемент из очереди, не удаляя

    public static LinkedList<Object> enqueue(LinkedList<Object> lst, Object o){
        lst.add(o);
        return lst;
    }


    public static Object dequeue(LinkedList<Object> lst){
        return lst.removeFirst();
    }


    public static Object first(LinkedList<Object> lst){
        return lst.getFirst();
    }
}
