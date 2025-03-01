package sem_2.Task2_4;

// 2.4 Задача «Автозаправочная станция»
// На автозаправочной станции только 2 колонки. Если все заняты, машины ждут в очереди.
// Когда колонка освобождается, следующий автомобиль из очереди начинает заправку.
// Использовать wait() и notify() для ожидания и освобождения заправки.
// Поток "Машина" ждет, если все колонки заняты.
// Поток "Машина" заправляется, затем освобождает колонку.

public class Main {
    public static void main(String[] args) {
        GasStation gasStation = new GasStation();

        for (int i = 0; i < 5; i++) {
            Car car = new Car(gasStation, "Машина " + (i + 1));
            car.start();
        }
    }
}


