package sem_1.Task1.Task8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class TestData {
    public static void main(String[] args) {
        String[] names = {"книга", "ручка", "линейка", "пенал"};
        Random random = new Random();
        ShopItem[] shopItems = new ShopItem[100];

        // Генерация 100 объектов ShopItem
        for (int i = 0; i < shopItems.length; i++) {
            // Генерируем случайные значения для полей
            String name = names[random.nextInt(names.length)];
            double price = random.nextInt(20) + 1; // цена
            int quantity = random.nextInt(10) + 1; // количество
            shopItems[i] = new ShopItem(name, price, quantity);
        }

        // Сортировка массива по цене
        Arrays.sort(shopItems, Comparator.comparingDouble(ShopItem::getPrice));

        // Вывод объектов в консоль
        System.out.println("Сортированные товары по цене:");
        for (ShopItem item : shopItems) {
            System.out.println(item);
        }

        // Подсчет количества одинаковых ShopItem
        int count = 0;
        for (int i = 0; i < shopItems.length; i++) {
            for (int j = i + 1; j < shopItems.length; j++) {
                if (shopItems[i].equals(shopItems[j])) {
                    count++;
                }
            }
        }
        System.out.println("Количество одинаковых товарных позиций: " + count);
    }
}
