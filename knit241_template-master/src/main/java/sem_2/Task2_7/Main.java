package sem_2.Task2_7;

// 2.7 Задача «Производитель-Потребитель с ограничением»
// Производитель создает товары (максимум 5).
// Потребитель забирает товары.
// Если товаров нет, потребитель ждет (wait()).
// Если товаров максимум, производитель ждет (wait()).
// wait() – если товаров нет или склад заполнен.
// notify() – пробуждение потока, когда изменяется состояние склада.

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Producer producer = new Producer(warehouse);
        Consumer consumer = new Consumer(warehouse);

        producer.start();
        consumer.start();
    }
}

