import java.util.ArrayList;
import java.util.Arrays;

import Solution.Task1;
import Solution.Task2;
import Solution.Task3;
import Solution.Helper;


public class App {
    public static void main(String[] args) throws Exception {
        // массив случайных интов, аргументы: количество элементов и максимальное значение
        int[] arr = Helper.getRndArr(10, 9);


        System.out.println("Task1");
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        Task1.mergeSort(arr, n);
        System.out.println(Arrays.toString(arr));
        System.out.println();


        System.out.println("Task2");
        ArrayList<Integer> ls2 = new ArrayList<>(Helper.getRndList(10, 9));
        System.out.println(ls2);
        System.out.println(Task2.getOdd(ls2));
        System.out.println();


        System.out.println("Task3");
        Task3.GetListSt(Helper.getRndList(10, 9));
    }
}
