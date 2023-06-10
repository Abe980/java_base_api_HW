import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task2 {
    // Реализуйте алгоритм сортировки пузырьком числового массива, 
    // результат после каждой итерации запишите в лог-файл


        public static int[] arrSort(int [] arr){
        try {
            Logger logger = Logger.getLogger(Task2.class.getName());
            logger.setLevel(Level.INFO);
            FileHandler fh = new FileHandler("arrsort.log", true);
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            for(int j = 0; j < arr.length-1; j++) {
                for (int i = 0; i < arr.length - j-1; i++){
                    if (arr[i] > arr[i+1]) {
                        int temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                    }
                }
                logger.info(Arrays.toString(arr));
            }
        }
        catch (Exception e){
            System.out.println("Ненашелся файл логов или не смогли записать");
        }
        
        return arr;
    }
}
