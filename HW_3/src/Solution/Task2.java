package Solution;

import java.util.ArrayList;

public class Task2 {
    // Пусть дан произвольный список целых чисел, удалить из него четные числа

    public static ArrayList<Integer> getOdd(ArrayList<Integer> ls){
        ArrayList<Integer> delLs = new ArrayList<>();
        for (int number : ls){
            if (number%2 == 0 && number != 0) delLs.add(number);
        }

        ls.removeAll(delLs);
        return ls;
    }
}
