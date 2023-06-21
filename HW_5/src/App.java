import java.util.ArrayList;
import java.util.HashMap;

import Solution.Task1;
import Solution.Task2;

public class App {
    public static void main(String[] args) throws Exception {

        // Task1

        // создаем телефонную книгу
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        // создаем несколько контактов для добавления
        String strI = "Ivanov 123456 123455 123454";
        String strP = "Petrov 654321 654322";
        String strS = "Sidorov 333333";

        // добавляем контакты
        Task1.addContacts(phoneBook, strI);
        Task1.addContacts(phoneBook, strP);
        Task1.addContacts(phoneBook, strS);
        // печатаем книгу
        Task1.printPhoneBook(phoneBook);

        // проверяем добавление номера в существующий контакт
        String strP2 = "Petrov 222222";
        Task1.addContacts(phoneBook, strP2);
        // проверяем добавление уже существующего номера контакту
        String strI2 = "Ivanov 123456";
        Task1.addContacts(phoneBook, strI2);
        // проверяем добавление контакта и двух одинаковых номеров
        String ya = "Ya 999 999";
        Task1.addContacts(phoneBook, ya);
        Task1.printPhoneBook(phoneBook);


        // Task2

        // создаем массив
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        // сортируем массив
        Task2.heapSort(sortArr);
        // печатаем массив
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + ", ");
        }
    }
}
