import java.util.Scanner;
import java.lang.Exception;


public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(task1(5));

        task2(20);

        runCalcTask3();
        
    }



    private static int task1(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }




    private static void task2(int n){
        for (int i=2; i<=n; i++){
            if (isPrimeNumber(i)){
                System.out.println(i);
            }
        }

    }




    private static boolean isPrimeNumber(int n){
        boolean res = true;
        for (int i = 2; i < n/2+1; i++){
            if (n % i == 0){
                res = false;
                break;
            }
        }
        return res;
    }




    private static void runCalcTask3(){
        boolean flag = true;
        while (flag){
            calcTask3();
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Продолжить? (y/n)");
            char yN = scan2.next().charAt(0);
            if (yN == 'n') flag = false;
        }
    }




    private static void calcTask3(){
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            double num1 = scan.nextDouble();
            System.out.println("Введите второе число: ");
            double num2 = scan.nextDouble();
            System.out.println("Введите действие: ");
            char arithAction = scan.next().charAt(0);
        
        
            switch (arithAction){
                case '+':
                    System.out.println(num1+num2);
                    break;
                case '-':
                    System.out.println(num1-num2);
                    break;
                case '*':
                    System.out.println(num1*num2);
                    break;
               case '/':
                    System.out.println(num1/num2);
                    break;
                default:
                    System.out.println("Не корректно задана операция");
        
            }    
        }
        catch (Exception e) {
            System.out.println("Не корректные данные");
        }
    }
}
