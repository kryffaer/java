package sem_1.Task19;

public class Task19 {
    // Напишите универсальный метод findMax, который принимает массив элементов любого типа,
    // реализующего интерфейс Comparable, и возвращает максимальный элемент.
    public static <T extends Comparable<T>> T findMax(T[] array) {

        T max = array[0]; // max - первый элементом массива

        // Принимает массив элементов любого типа, реализующего интерфейс Comparable, и возвращает максимальный элемент.
        for (T el : array) {
            if (el.compareTo(max) > 0) {
                max = el;
            }
        }
        return max;
    }
}
