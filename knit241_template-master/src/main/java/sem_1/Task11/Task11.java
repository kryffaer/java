package sem_1.Task11;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task11 {
    private Set<String> students;

    public Task11() {
        students = new TreeSet<>();
    }

    // Добавить студента
    public void addStudent(String name) {
        if (students.add(name)) {
            System.out.println("Студент добавлен");
        } else {
            System.out.println("Студент с таким именем уже существует");
        }
    }

    // Удалить студента
    public void removeStudent(String name) {
        if (students.remove(name)) {
            System.out.println("Студент удален");
        } else {
            System.out.println("Студент не найден");
        }
    }

    // Показать всех студентов
    public void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Список студентов пуст");
        } else {
            System.out.println("Список студентов:");
            students.forEach(System.out::println);
        }
    }

    // Поиск студента по имени
    public void findStudent(String name) {
        if (students.contains(name)) {
            System.out.println("Студент найден");
        } else {
            System.out.println("Студент не найден");
        }
    }

    public static void main(String[] args) {
        Task11 sms = new Task11();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Добавить студента");
            System.out.println("2. Удалить студента");
            System.out.println("3. Показать всех студентов");
            System.out.println("4. Найти студента");
            System.out.println("5. Выйти");
            System.out.print("Выберите опцию: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Очищаем буфер

            switch (option) {
                case 1:
                    System.out.print("Введите имя студента: ");
                    String nameToAdd = scanner.nextLine();
                    sms.addStudent(nameToAdd);
                    break;
                case 2:
                    System.out.print("Введите имя студента для удаления: ");
                    String nameToRemove = scanner.nextLine();
                    sms.removeStudent(nameToRemove);
                    break;
                case 3:
                    sms.showAllStudents();
                    break;
                case 4:
                    System.out.print("Введите имя студента для поиска: ");
                    String nameToFind = scanner.nextLine();
                    sms.findStudent(nameToFind);
                    break;
                case 5:
                    System.out.println("Программа завершена");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверная опция, попробуйте снова");
            }
        }
    }
}
