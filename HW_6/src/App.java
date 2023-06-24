import java.util.HashSet;

import UnicornLibrary.Unicorn;

public class App {
    public static void main(String[] args) throws Exception {
        // создаем единорогов
        Unicorn uni1 = new Unicorn(1, "Sam", 11, true, "Белый");
        Unicorn uni2 = new Unicorn(2, "Suzzy", 8, false, "Белый в серый горошек");
        Unicorn uni3 = new Unicorn(3, "Max", 15, true, "Белый");

        // печатаем созданных
        System.out.println(uni1);
        System.out.println(uni2);
        System.out.println(uni3);

        //сравниваем двух единорогов
        System.out.println("Sam and Max equals: " + uni1.equals(uni3));
        
        // создаем сет единорогов
        HashSet<Unicorn> unicorns = new HashSet<>();
        // добавляем единорогов в сет
        unicorns.add(uni1);
        unicorns.add(uni2);
        unicorns.add(uni3);

        // проверяем, есть ли единорог в нашем сете
        System.out.println("Sam состоит в обществе единорогов: " + unicorns.contains(uni1));
    }
}
