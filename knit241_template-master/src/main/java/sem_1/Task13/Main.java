package sem_1.Task13;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<User> users = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //loadUsers(); // Загружаем пользователей при старте программы
        boolean running = true;

        System.out.println("Добро пожаловать в систему управления пользователями");

        while (running) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить нового пользователя");
            System.out.println("2. Показать всех пользователей");
            System.out.println("3. Сохранить список пользователей в файл");
            System.out.println("4. Загрузить список пользователей из файла");
            System.out.println("5. Выйти");
            System.out.print("Выберите опцию: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очищаем буфер

            switch (choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    showUsers();
                    break;
                case 3:
                    saveUsers();
                    break;
                case 4:
                    loadUsers();
                    break;
                case 5:
                    //saveUsers(); // Сохраняем перед выходом
                    System.out.println("Программа завершена");
                    running = false;
                    break;
                default:
                    System.out.println("Неверная опция, попробуйте снова");
                    break;
            }
        }
        scanner.close();
    }

    // Добавить пользователя
    private static void addUser() {
        System.out.print("Введите имя пользователя: ");
        String name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Очищаем буфер
        System.out.print("Введите email: ");
        String email = scanner.nextLine();

        users.add(new User(name, age, email));
        System.out.println("Пользователь добавлен");
    }

    // Показать всех пользователей
    private static void showUsers() {
        System.out.println("Список пользователей:");
        for (int i = 0; i < users.size(); i++) {
            System.out.println((i + 1) + ". " + users.get(i));
        }
    }

    // Сохранить список в файл
    private static void saveUsers() {
        try {
            UserManager.saveUsers(users);
            System.out.println("Список сохранён в файл");
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении списка пользователей: " + e.getMessage());
        }
    }

    // Загрузить список из файла
    private static void loadUsers() {
        try {
            users = UserManager.loadUsers();
            System.out.println("Список успешно загружен из файла");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при загрузке списка пользователей: " + e.getMessage());
        }
    }
}