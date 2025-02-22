package sem_1.Task23;

public class Task23 {
    // Напишите универсальный метод printType, который принимает объект любого типа и выводит на экран имя его класса
    public static <T> void printType(T obj)
    {
            System.out.println("Имя класса: " + obj.getClass().getName());
    }
}
