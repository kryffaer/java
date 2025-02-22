package sem_1.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        Scanner scanner = new Scanner(System.in);

        label:
        while (true) {
            System.out.print("1. Добавить сферу\n2. Добавить куб\n3. Добавить цилиндр\n4. Выйти\nВведите номер действия: ");
            String chose = scanner.next();


            switch (chose) {
                case "1": {
                    System.out.print("Введите радиус сферы: ");
                    int i = scanner.nextInt();
                    Sphere sphere = new Sphere(i);
                    container.add(sphere);
                    System.out.println("Оставшийся объём контейнера: " + container.getContainerVolume());

                    break;
                }
                case "2": {
                    System.out.print("Введите сторону куба: ");
                    int i = scanner.nextInt();
                    Cube cube = new Cube(i);
                    container.add(cube);
                    System.out.println("Оставшийся объём контейнера: " + container.getContainerVolume());

                    break;
                }
                case "3": {
                    System.out.print("Введите радиус цилиндра: ");
                    int i = scanner.nextInt();
                    System.out.print("Введите высоту цилиндра: ");
                    int j = scanner.nextInt();
                    Cylinder cylinder = new Cylinder(i, j);
                    container.add(cylinder);
                    System.out.println("Оставшийся объём контейнера: " + container.getContainerVolume());

                    break;
                }
                case "4":
                    break label;
            }
        }
    }
}
