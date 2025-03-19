package sem_2.labor2_2.Task2_7;

import sem_2.TaskDescription;

@TaskDescription(name = "2.7 Задача «Производитель-Потребитель с ограничением»", description =
        "Производитель создает товары (максимум 5).\n" +
                "Потребитель забирает товары.\n" +
                "Если товаров нет, потребитель ждет (wait()).\n" +
                "Если товаров максимум, производитель ждет (wait()).\n" +
                "wait() – если товаров нет или склад заполнен.\n" +
                "notify() – пробуждение потока, когда изменяется состояние склада.")

public class Task2_7 {
    public void execute() {
        Warehouse warehouse = new Warehouse();
        Producer producer = new Producer(warehouse);
        Consumer consumer = new Consumer(warehouse);

        producer.start();
        consumer.start();
    }
}
