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
        String[] arrContact = contact.split(" ");
        if (phoneBook.containsKey(arrContact[0])){
            for (int i=1; i<arrContact.length; i++){
                if (!(phoneBook.get(arrContact[0]).contains(arrContact[i]))){
                    phoneBook.get(arrContact[0]).add(arrContact[i]);
                }
            }
        }
        else {
            ArrayList<String> arrLs = new ArrayList<>();
            phoneBook.put(arrContact[0], arrLs);
            for (int i=1; i<arrContact.length; i++){
                if (!(phoneBook.get(arrContact[0]).contains(arrContact[i]))){
                    phoneBook.get(arrContact[0]).add(arrContact[i]);
                }
            }

        }
    }

    public static void printPhoneBook(HashMap<String, ArrayList<String>> phoneBook){
        for (Map.Entry<String, ArrayList<String>> item : phoneBook.entrySet()){
            System.out.println(item.getKey() + ":");
            for (int i=0; i<item.getValue().size(); i++){
                System.out.println("   " + item.getValue().get(i));
            }
            System.out.println();
        }
    }
}
