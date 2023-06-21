package Solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    // Реализуйте структуру телефонной книги с помощью HashMap. Программа также должна
    // учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
    // их необходимо считать, как одного человека с разными телефонами. Вывод должен быть 
    // отсортирован по убыванию числа телефонов.(можно выводить без сортировки, 
    // но обязательно в отдельном методе)

    

    public static void addContacts(HashMap<String, ArrayList<String>> phoneBook, String contact){
        // делим строку на массив по пробелам, первый элемент - фамилия
        String[] arrContact = contact.split(" ");
        // проверяем существует ли фамилия в телефонной книге
        if (phoneBook.containsKey(arrContact[0])){
            // если фамилия есть, добавляем к ней телефоны.
            for (int i=1; i<arrContact.length; i++){
                // проверяем есть ли уже такой телефон в книге, если нет добавляем
                if (!(phoneBook.get(arrContact[0]).contains(arrContact[i]))){
                    phoneBook.get(arrContact[0]).add(arrContact[i]);
                }
            }
        }
        else {
            ArrayList<String> arrLs = new ArrayList<>();
            // добавляем фамилию в книгу
            phoneBook.put(arrContact[0], arrLs);
            // добавляем контакты
            for (int i=1; i<arrContact.length; i++){
                // проверка на одинаковые контакты
                if (!(phoneBook.get(arrContact[0]).contains(arrContact[i]))){
                    phoneBook.get(arrContact[0]).add(arrContact[i]);
                }
            }

        }
    }

    public static void printPhoneBook(HashMap<String, ArrayList<String>> phoneBook){
        // печатаем книгу
        for (Map.Entry<String, ArrayList<String>> item : phoneBook.entrySet()){
            // печатаем фамилию
            System.out.println(item.getKey() + ":");
            // печатаем телефоны
            for (int i=0; i<item.getValue().size(); i++){
                System.out.println("   " + item.getValue().get(i));
            }
            System.out.println();
        }
    }
}
