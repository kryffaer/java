package sem_1.Task13;

// Реализованы методы для сериализации и десериализации объектов User
// Сериализация сохраняет список пользователей в файл
// Десериализация восстанавливает список пользователей из файла

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private static final String FILE_NAME = "sem_1/Task1/users.ser";

    // Метод принимает список пользователей и сохраняет его в файл с помощью сериализации
    public static void saveUsers(List<User> users) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(users);
        }
    }

    // Метод загружает пользователей из файла и возвращает их в виде списка
    public static List<User> loadUsers() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<User>) ois.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>(); // Возвращаем пустой список, если файл не найден
        }
    }
}