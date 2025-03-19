package sem_2.labor2_2.Task2_4;

import sem_2.TaskDescription;

@TaskDescription(name = "2.4 Задача «Автозаправочная станция»", description =
        "На автозаправочной станции только 2 колонки. Если все заняты, машины ждут в очереди.\n" +
                "// Когда колонка освобождается, следующий автомобиль из очереди начинает заправку.\n" +
                "// Использовать wait() и notify() для ожидания и освобождения заправки.\n" +
                "// Поток Машина ждет, если все колонки заняты.\n" +
                "// Поток Машина заправляется, затем освобождает колонку.")

public class Task2_4 {
    public void execute() {
        GasStation gasStation = new GasStation();

        for (int i = 0; i < 5; i++) {
            Car car = new Car(gasStation, "Машина " + (i + 1));
            car.start();
        }
    }
}
