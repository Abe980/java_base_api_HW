package Solution;

import java.util.Random;
import java.util.ArrayList;

public class Helper {

    public static int[] getRndArr(int score, int max){
        // Возвращает массив случайных чисел, длиной score и максимальным значением элемента max
        int[] arr = new int[score];
        Random rn = new Random();
        for (int i=0; i<score; i++){
            arr[i] = rn.nextInt(max+1);
        }
        return arr;
    }


    public static ArrayList<Integer> getRndList(int score, int max){
        // Возвращает список случайных чисел, длиной score и максимальным значением элемента max
        ArrayList<Integer> ls = new ArrayList<>();
        Random rn = new Random();
        for (int i=0; i<score; i++){
            ls.add(rn.nextInt(max+1));
        }
        return ls;
    }
    
}
