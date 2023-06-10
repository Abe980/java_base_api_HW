import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        // получилось передать строку только через файл, отсюда лишний метод...
        System.out.println(Task1.getSqlQery(Task1.readFile()));


        int[] arr = new int[] {4, 2, 6, 1, 5, 9, 3};
        Task2.arrSort(arr);
    }
}
