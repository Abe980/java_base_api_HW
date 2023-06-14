package Solution;

import java.util.ArrayList;
import java.util.Collections;


public class Task3 {
    // Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка


    public static void GetListSt(ArrayList<Integer> ls){
        System.out.println(ls);
        
        System.out.print("Минимальное число: ");
        System.out.println(Collections.min(ls));

        System.out.print("Максимальное число: ");
        System.out.println(Collections.max(ls));

        double sum = 0;
        for (int i : ls){
            sum += i;
        }
        System.out.print("Среднее арифметическое: ");
        System.out.println(sum / ls.size());
    }
}
