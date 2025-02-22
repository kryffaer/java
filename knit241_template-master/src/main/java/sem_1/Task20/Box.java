package sem_1.Task20;

import java.util.ArrayList;
import java.util.List;

// Создайте класс Box с ограничением типа T extends Number
public class Box<T extends Number> {
    private final List<T> items;

    public Box() {
        items = new ArrayList<>();
    }

    // Метод для добавления элемента в контейнер
    public void add(T item) {
        items.add(item);
    }

    // Реализуйте метод для вычисления суммы всех чисел, хранящихся в контейнере
    public double sum() {
        double summ = 0.0;
        for (T item : items) {
            summ += item.doubleValue();
        }
        return summ;
    }
}