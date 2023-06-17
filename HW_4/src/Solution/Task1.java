package Solution;

import java.util.Collections;
import java.util.LinkedList;

public class Task1 {
    
    public static LinkedList<Object> revLLst(LinkedList<Object> lst){
        // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, 
        //который вернет “перевернутый” список

        Collections.reverse(lst);
        return lst;
    }
}
