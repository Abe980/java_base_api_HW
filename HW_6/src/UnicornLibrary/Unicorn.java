package UnicornLibrary;

import java.util.Objects;

public class Unicorn {
    
    // определяем поля класса
    public long id;
    public String name;
    public int age;
    public boolean isMan;
    public String color;

    // создаем конструктор
    public Unicorn(long id, String name, int age, boolean isMan, String color) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isMan = isMan;
        this.color = color;
    }

    // переопределяем toString
    @Override
    public String toString() {
        return "Имя: " + name + "  id: " + id + "  цвет: " + color;
    }

    // переопределяем equals
    @Override
    public boolean equals(Object o) {
        // проверка на самого себя
        if (this == o) return true;
        // проверка на переданный null и совпадение классов в сравниваемых
        if (o == null || getClass() != o.getClass()) return false;
        // приводим переданный объект к единорогу
        Unicorn unicorn = (Unicorn) o;
        // сравниваем значение нужных полей и возвращаем результат
        return color == unicorn.color && isMan == unicorn.isMan ;
    }

    // переопределяем hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, isMan, color);
    }
}
