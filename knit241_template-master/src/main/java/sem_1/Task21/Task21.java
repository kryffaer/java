package sem_1.Task21;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task21 {
    // Напишите универсальный метод filter, который принимает список элементов и предикат (интерфейс Predicate<T>)
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        // Метод должен возвращать новый список, содержащий только те элементы, которые удовлетворяют предикату
        for (T item : list)
        {
            if (predicate.test(item))
            {
                filteredList.add(item);
            }
        }
        return filteredList;
    }
}